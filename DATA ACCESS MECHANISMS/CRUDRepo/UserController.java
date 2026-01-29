package com.Spring.UserRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	UserService userservice;
	
	
	
	@RequestMapping("/")
	public String showReg(Model model ) {
		model.addAttribute("user", new User());
		return "UserDet";
	}
	
	@RequestMapping("/register")
	public String registerUser(@ModelAttribute @Valid User user, BindingResult result) {
		if(result.hasErrors()) {
			return "UserDet";
		}
		userservice.saveUser(user);
		return "success";
		
	}

}
