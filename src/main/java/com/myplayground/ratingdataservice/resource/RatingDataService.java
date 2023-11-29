package com.myplayground.ratingdataservice.resource;

import com.myplayground.ratingdataservice.models.Ratings;
import com.myplayground.ratingdataservice.models.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataService {
    @RequestMapping("{movieId}")
    public Ratings getRatings(@PathVariable("movieId") String movieId){
        return new Ratings(movieId, 4);
    }
    @RequestMapping("/users/{usedId}")
    public UserRatings getUserRatings(@PathVariable("usedId") String usedId){
       List<Ratings> ratings = Arrays.asList(
               new Ratings("1234", 4),
               new Ratings("5678", 3)
       );
       UserRatings userRatings = new UserRatings();
       userRatings.setUserRatings(ratings);
        return userRatings;
    }
}

