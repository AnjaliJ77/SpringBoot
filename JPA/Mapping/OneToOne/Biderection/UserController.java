package OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
	
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/post")
	public UserDetail createUser(@RequestBody UserDetail userdetail) {
		return userservice.createUser(userdetail);
		
		
	}


}
