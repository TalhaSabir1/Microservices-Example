package com.code.hotel.service.repositories;

import com.code.hotel.service.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}

