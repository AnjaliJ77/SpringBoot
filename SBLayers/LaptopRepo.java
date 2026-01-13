package com.Spring.Boot.ServiceAndRepo;

import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
	
	void save(Laptop lap) {
		System.out.println("Repo");
	}

}
