package com.Spring.Boot.ServiceAndRepo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class AddController {
	@Autowired
	AddService service;
	
	@GetMapping("/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return service.addNum(a, b);
	}
	
	 
	
	
	
	
	

}
