package com.schallenge.hotels;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
	List<Hotel> findAllByOrderByName();

	List<Hotel> findByNameOrderByName(String name);

	List<Hotel> findByAddressOrderByName(String address);

	List<Hotel> findByNameAndAddressOrderByName(String name, String address);
}