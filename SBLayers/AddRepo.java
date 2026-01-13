package com.Spring.Boot.ServiceAndRepo;

import org.springframework.stereotype.Repository;

@Repository
public class AddRepo {
	
	int add(int a, int b) {
		return a+b;
		
	}

}
