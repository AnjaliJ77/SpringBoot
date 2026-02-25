package H2AndUUID.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StuCon {
	@Autowired
	StuService stuservice;
	
	@PostMapping("/add")
	StuEntity createStu(@RequestBody StuEntity stuentity) {
		return stuservice.save(stuentity);
	}

}
