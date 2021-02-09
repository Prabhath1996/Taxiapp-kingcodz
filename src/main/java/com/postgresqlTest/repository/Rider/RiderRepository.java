package com.postgresqlTest.repository.Rider;

import java.util.List;



public interface RiderRepository {

	 int count();

	    int save(Rider rider);

	    int update(Rider rider);

	    int deleteById(Long id);

	    List<Rider> findAll();
	    
	    List<String> getAllUser();
	 
	}
	

