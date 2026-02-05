package com.example.Microservice1;

import lombok.Data;

@Data
public class UpdateHotelAddrDTO {
	
	private String address;
	private String city;
	private int postalCode;

}
