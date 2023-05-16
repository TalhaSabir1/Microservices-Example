package com.code.rating.service.services.impl;

import com.code.rating.service.entities.Rating;
import com.code.rating.service.repository.RatingRepository;
import com.code.rating.service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {


    @Autowired
    private RatingRepository repository;

    @Override
    public Rating create(Rating rating) {
        //generate  unique userid
        String randomRatingId = UUID.randomUUID().toString();
        rating.setRatingId(randomRatingId);
        return repository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return repository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return repository.findByHotelId(hotelId);
    }
}

