package com.adil.rating.services;

import com.adil.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //create rating
    Rating createRating(Rating rating);

    //get all ratings

    List<Rating> getRatings();

    //get all by user Id
    List<Rating> getRatingByUserId(String userID);

    //get all by hotel Id
    List<Rating> getRatingByHotelId(String hotelId);

}
