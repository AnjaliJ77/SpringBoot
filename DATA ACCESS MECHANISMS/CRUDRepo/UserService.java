package com.Spring.UserRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepo userrepo;
	
	
	
	public void saveUser(User user) {
		userrepo.save(user);
		
		
	}

}
