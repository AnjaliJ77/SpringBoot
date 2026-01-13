package com.Spring.Boot.DIBean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "nosql", value = "enabled", havingValue = "true", matchIfMissing = false)
public class NoSql {

	public NoSql() {
		System.out.println("Constructor from NoSql");
	}
	

}
