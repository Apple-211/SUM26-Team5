package com.CSC340.HobbyCircles.review;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;

    }

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/{reviewId}")
    public Review getReviewById(@PathVariable Long reviewId) {
        return reviewService.getReviewById(reviewId);
    }

    @GetMapping("/event/{eventId}")
    public List<Review> getReviewsByEvent(@PathVariable Long eventId) {
        return reviewService.getReviewsByEvent(eventId);
    }

    @PostMapping("/event/{eventId}")
    public Review createReview(@PathVariable Long eventId, @RequestBody Review review) {
        return reviewService.createReview(eventId, review);

    }

    @DeleteMapping("/{reviewId}")
    public void deleteReview(@PathVariable Long reviewId) {
        reviewService.deleteReview(reviewId);
    }
    
}
