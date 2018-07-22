package com.schallenge.hotels;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	public List<Hotel> getAllAscending() {
		return hotelRepository.findAllByOrderByName();
	}

	@Override
	public Hotel create(Hotel newHotel) {
		return hotelRepository.save(newHotel);
	}
 
	@Override
	public Hotel update(Hotel updateHotel) {
		return hotelRepository.save(updateHotel);
	}

	@Override
	public List<Hotel> getByNameOrAddress(String name, String address) {
		return hotelRepository.findByNameOrAddress(name, address);
	}

}
