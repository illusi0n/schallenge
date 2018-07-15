package com.schallenge.hotels;

import java.util.List;

public interface HotelService {
	
	List<Hotel> getAllAscending();
	Hotel create(Hotel newHotel);
	Hotel update(Hotel updateHotel);
}
