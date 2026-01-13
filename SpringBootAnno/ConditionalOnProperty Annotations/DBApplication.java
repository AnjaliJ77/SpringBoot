package com.Spring.Boot.DIBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan
public class DBApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = SpringApplication.run(DBApplication.class, args);
		SuperDB obj = context.getBean(SuperDB.class);
		

	}

}
