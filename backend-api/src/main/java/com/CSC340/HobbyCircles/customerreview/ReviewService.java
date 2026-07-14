
package com.CSC340.HobbyCircles.customerreview;

import java.util.List;

import org.springframework.stereotype.Service;

@Service("customerReviewService")
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long reviewId) {
        return reviewRepository.findById(reviewId).orElse(null);
    }

    public List<Review> getReviewsByCustomerId(Long customerId) {
        return reviewRepository.findByCustomerCustomerId(customerId);
    }

    public List<Review> getReviewsByGroupId(Long groupId) {
        return reviewRepository.findByGroupId(groupId);
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }
}