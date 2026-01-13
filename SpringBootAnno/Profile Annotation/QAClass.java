package com.Spring.Boot.DIBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Profile("QA")
public class QAClass {
	
	@Value("${username}")
	String username;
	
	@Value("${password}")
	String password;
	
	@PostConstruct
	public void init() {
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
	}

	public QAClass() {
		System.out.println("QA cons");
	}

	
}
