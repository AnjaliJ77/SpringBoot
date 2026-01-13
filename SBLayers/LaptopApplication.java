package com.Spring.Boot.ServiceAndRepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Spring.Boot.SpringgApplication;
import com.Spring.Boot.laptop;

@SpringBootApplication
public class LaptopApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = SpringApplication.run(LaptopApplication.class, args);
		Laptop lap = context.getBean(Laptop.class);
		LapService service = context.getBean(LapService.class);
		
		service.addlap(lap);
		service.rev(lap);

	}

}
