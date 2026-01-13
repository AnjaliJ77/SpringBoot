package com.Spring.Boot.ServiceAndRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AddService {
	
	
	@Autowired
	private AddRepo repo;
	
	public int addNum(int x, int y) {
		return repo.add(x, y);
	}

}
