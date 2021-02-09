package com.postgresqlTest;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class PostgresqlTestApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(PostgresqlTestApplication.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	
	public static void main(String[] args) {
		SpringApplication.run(PostgresqlTestApplication.class, args);
		
	}
	public void run(String... args) {
		log.info("StartApplication...");
		runJDBC();
	}
	
	void runJDBC() {

		log.info("Creating tables for testing...");

		/*
		 *  Drop Rider Table
		 */
		jdbcTemplate.execute("DROP TABLE IF EXISTS rider;");
		
		/*
		 * #############################################################################
		 */
		
		/* Created Rider Table */
		jdbcTemplate.execute("CREATE TABLE rider(" + "id SERIAL," + " name VARCHAR(255)," + " joined_date TIMESTAMP,"
				+ "  gender VARCHAR(255)," + "  country VARCHAR(255)," + "  phone_no VARCHAR(12)," + "  dob VARCHAR(255),"+ "  current_payment_type VARCHAR(255)," + "  current_payement_ac VARCHAR(255)," + " PRIMARY KEY (phone_no) )");

		System.out.println("Rider Table Created");
		
		/*
		 * #############################################################################
		 */


		

		

	}

}

@RestController
class helloController{
	
	@GetMapping("/")
	String hello() {
		return "hello world";
	}
}
