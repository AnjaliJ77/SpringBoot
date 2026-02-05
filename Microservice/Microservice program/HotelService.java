package com.example.Microservice1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

	
	
	@Autowired
	private HotelRepo hotelrep;
	
	public Hotel saveHotel(HotelDTO hoteldto) {
		Hotel hotel=new Hotel();
		hotel.setName(hoteldto.getName());
		hotel.setAddress(hoteldto.getAddress());
		hotel.setCity(hoteldto.getCity());
		hotel.setPostalCode(hoteldto.getPostalCode());
		hotel.setRatings(hoteldto.getRatings());
		hotel.setAvailable(hoteldto.isAvailable());
		
		hotelrep.save(hotel);
		return hotel;
		
	}


	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return hotelrep.findAll();
	}


	public Hotel getHotelById(Integer id) {
		Optional<Hotel> hotelbox = hotelrep.findById(id);
		if(hotelbox.isPresent()) {
			
		
		}
		else 
			return null;
		return null;
		
	}


	public Hotel updateHotelAdd(HotelDTO hoteldto, Integer id) {
		Hotel hotel=getHotelById(id);
		if(hotel != null) {
			hotel.setName(hoteldto.getName());
			hotel.setAddress(hoteldto.getAddress());
			hotel.setCity(hoteldto.getCity());
			hotel.setPostalCode(hoteldto.getPostalCode());
			hotel.setRatings(hoteldto.getRatings());
			hotel.setAvailable(hoteldto.isAvailable());
			
			hotelrep.save(hotel);
		}
	
		return hotel;
		
		
	}


	public void deleteHotel(Integer id) {
		Hotel hotel = getHotelById(id);
		if(hotel !=null) {
		hotelrep.deleteById(id);
	}
	}


}
