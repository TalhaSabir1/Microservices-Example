package com.code.user.service.external.services;

import com.code.user.service.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

    @PostMapping("/ratings")
    public Rating createRating(Rating rating);

    @PutMapping("/ratings/{ratingId}")
    public Rating updateRating(@PathVariable String ratingId, Rating rating);

    @DeleteMapping("/ratings/{ratingId}")
    public Rating deleteRating(@PathVariable String ratingId);
}
