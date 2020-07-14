package com.fullcheckpoint.mrWhite.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired ReviewService service;

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id){
        service.deleteReview(id);
    }

    @PutMapping("/{id}")
    public void editReview(@RequestBody Review review, @PathVariable Long id){
        service.editReview(review, id);
    }

    @PostMapping("")
    public void postReview(@RequestBody Review review){
        service.postReview(review);
    }
}
