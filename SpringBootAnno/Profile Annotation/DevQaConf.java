package com.Spring.Boot.DIBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DevQaConf {
	
	@Autowired(required = false)
	DevClass dev;
	
	@Autowired(required = false)
	QAClass qa;

	public DevQaConf() {
		System.out.println("DevQACon Constructor");
	}
	
	
	
	

}
