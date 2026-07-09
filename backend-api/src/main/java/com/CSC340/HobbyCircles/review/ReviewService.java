package com.CSC340.HobbyCircles.review;


import com.CSC340.HobbyCircles.event.Event;
import com.CSC340.HobbyCircles.event.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final EventRepository eventRepository;

    public ReviewService(ReviewRepository reviewRepository, EventRepository eventRepository) {
        this.reviewRepository = reviewRepository;
        this.eventRepository = eventRepository;
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long reviewId) {
        return reviewRepository.findById(reviewId).orElse(null);
    }

    public List<Review> getReviewsByEvent(Long eventId) {
        return reviewRepository.findByEventEventId(eventId);
    }

    public Review createReview(Long eventId, Review review) {
        Event event = eventRepository.findById(eventId).orElse(null);

        if (event == null) {
            return null;
        }

        review.setEvent(event);
        return reviewRepository.save(review);
    }

    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);

    }


    
}
