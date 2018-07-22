package com.schallenge.hotels;

import java.util.List;

public interface HotelService {
	
	Hotel create(Hotel newHotel);
	Hotel update(Hotel updateHotel);
	List<Hotel> getByNameAndAddressOrderByNameAsc(String name, String address);
}
