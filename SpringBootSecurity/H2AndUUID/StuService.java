package H2AndUUID.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuService {

	
	
	@Autowired
	StuReposit sturepo;
	
	public StuEntity save(StuEntity stuentity) {
		// TODO Auto-generated method stub
		return sturepo.save(stuentity);
	}

}
