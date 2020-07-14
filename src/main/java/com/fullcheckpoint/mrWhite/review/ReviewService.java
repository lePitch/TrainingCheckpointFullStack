package com.fullcheckpoint.mrWhite.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired ReviewRepository repository;

    public void postReview(Review review){
        repository.save(review);
    }
    public void editReview(Review review, Long id){
        Review newReview = review;
        newReview.setId(id);
        repository.save(newReview);
    }
    public void deleteReview(Long id){
        repository.deleteById(id);
    }
}
