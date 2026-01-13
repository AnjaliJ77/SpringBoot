package com.Spring.Boot.ServiceAndRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Boot.laptop;
@Service
public class LapService {

	@Autowired
	private LaptopRepo repo;
	
	
	public LaptopRepo getRepo() {
		return repo;
	}
	public void setRepo(LaptopRepo repo) {
		this.repo = repo;
	}
	public void addlap(Laptop lap) {
		// TODO Auto-generated method stub
		repo.save(lap);
		System.out.println("Service of Lap");
		
	}
	public boolean rev(Laptop lap) {
		return true;
	}
	

	

}
