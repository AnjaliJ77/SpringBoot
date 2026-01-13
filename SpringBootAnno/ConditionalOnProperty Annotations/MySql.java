package com.Spring.Boot.DIBean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "mysql",value = "enabled", havingValue = "true", matchIfMissing = false)        //Check app.property for the value and prefix
public class MySql {

	public MySql() {
		System.out.println("Constructor from MySql");
	}
	

}

