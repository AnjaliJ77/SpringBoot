package com.Spring.Boot.DIBean;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class SuperDB {

	@Autowired(required = false)       //Inject this dependency if a bean is available.  If not, don’t throw an error — just set it to null.”
	public MySql mysql;
	
	@Autowired(required = false)     //by default it's true
	public NoSql nosql;
	
	
	
	public SuperDB() {
		System.out.println("Constructor from SuperDB");
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("DB Con is created");
		System.out.println("Is my MYSQL is null?: "+ Objects.isNull(mysql));
		System.out.println("Is my NOSQL is null?: "+ Objects.isNull(nosql));
	}
	
	

	

	

}
