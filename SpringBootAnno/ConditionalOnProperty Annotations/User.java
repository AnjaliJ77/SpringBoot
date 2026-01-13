package com.Spring.Boot.DIBean;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	@Autowired        //Field injection
	private Order order;
	public User() {
		System.out.println("Constructor from User class");
		// TODO Auto-generated constructor stub
	}
	
	
	//Setter injection type
//	@Autowired
//	void setterDepInjec(Order order) {
//		this.order=order;
//	}
	
	// Constructor injection---
	@Autowired
	public void User(Order order) {
		this.order=order;
		System.out.println("User initialized with Order");
	}
	

}
