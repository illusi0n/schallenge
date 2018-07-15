package com.schallenge.hotels;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@ApiOperation(value="Get all hotels by name in ascending order")
	@GetMapping("/hotels")
	public List<Hotel> getAllAscending() {
		return hotelService.getAllAscending();
	}

	@ApiOperation(value="Create new hotel by providing hotel details")
	@PostMapping("/hotels")
	public Hotel create(@RequestBody Hotel newHotel) {
		return hotelService.create(newHotel);
	}

	@ApiOperation(value="Update hotel by providing updated details")
	@PutMapping("/hotels")
	public Hotel update(@RequestBody Hotel updateHotel) {
		return hotelService.update(updateHotel);
	}

	@ApiOperation(value="Search hotel by name and address.Currently working only with both parameters.")
	@GetMapping("/hotels/search")
	public Hotel getByNameOrAddress(@RequestParam(required=false) String name, @RequestParam(required=false) String address) {
		return hotelService.getByNameOrAddress(name, address);
	}
}
