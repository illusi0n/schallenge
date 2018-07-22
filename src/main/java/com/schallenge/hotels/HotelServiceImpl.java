package com.schallenge.hotels;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel create(Hotel newHotel) {
		return hotelRepository.save(newHotel);
	}

	@Override
	public Hotel update(Hotel updateHotel) {
		return hotelRepository.save(updateHotel);
	}

	@Override
	public List<Hotel> getByNameAndAddressOrderByNameAsc(String name, String address) {

		if (name == null && address == null) {
			return hotelRepository.findAllByOrderByName();
		}
		if (name == null) {
			return hotelRepository.findByAddressOrderByName(address);
		}
		if (address == null) {
			return hotelRepository.findByNameOrderByName(name);
		}
		return hotelRepository.findByNameAndAddressOrderByName(name, address);
	}

}