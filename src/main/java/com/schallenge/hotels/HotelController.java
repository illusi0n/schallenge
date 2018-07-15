package com.schallenge.hotels;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@GetMapping("/hotels")
	public List<Hotel> getAllAscending() {
		return hotelService.getAllAscending();
	}

	@PostMapping("/hotels")
	public Hotel create(@RequestBody Hotel newHotel) {
		return hotelService.create(newHotel);
	}

	@PutMapping("/hotels")
	public Hotel getAllById(@RequestBody Hotel updateHotel) {
		return hotelService.update(updateHotel);
	}
}
