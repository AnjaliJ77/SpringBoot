package com.example.Microservice1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotController {
	
	@Autowired
	private HotelService hotelservice;
	
	@PostMapping("/createhotel")
	public Hotel createHot(@RequestBody HotelDTO hoteldto) {
		return hotelservice.saveHotel(hoteldto);
	}
	
	@GetMapping("/gethotel")
	public List<Hotel> getAllHotels() {
		return hotelservice.getAllHotel();
	}
	
	@GetMapping("/getById/{id}")
	public Hotel getHotelById(Integer id){
		return hotelservice.getHotelById(id);	
	}
	
	@PutMapping("/update/{id}")
	public Hotel updateHotelAdd(@RequestBody HotelDTO hoteldto, @PathVariable Integer id) {
		return hotelservice.updateHotelAdd(hoteldto,id);
	}
	
	@DeleteMapping("/deletemap/{id}")
	public void deleteHotel(Integer id) {
		hotelservice.deleteHotel(id);
		
	}

}

