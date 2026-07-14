
package com.CSC340.HobbyCircles.customerreview;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CSC340.HobbyCircles.Customer.Customer;
import com.CSC340.HobbyCircles.Customer.CustomerService;

@RestController("customerReviewController")
@RequestMapping("/api")
public class ReviewController {
    private final ReviewService reviewService;
    private final CustomerService customerService;

    public ReviewController(ReviewService reviewService, CustomerService customerService) {
        this.reviewService = reviewService;
        this.customerService = customerService;
    }

    @GetMapping("/customer-reviews")
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/customers/{customerId}/reviews")
    public List<Review> getReviewsByCustomer(@PathVariable Long customerId) {
        return reviewService.getReviewsByCustomerId(customerId);
    }

    @GetMapping("/groups/{groupId}/reviews")
    public List<Review> getReviewsByGroup(@PathVariable Long groupId) {
        return reviewService.getReviewsByGroupId(groupId);
    }

    // Write a review. Body needs { "groupId": X, "rating": Y, "comment": "..." }
    @PostMapping("/customers/{customerId}/reviews")
    public Review createReview(@PathVariable Long customerId, @RequestBody Review review) {
        Customer customer = customerService.getCustomerById(customerId);
        if (customer == null) {
            return null;
        }
        review.setCustomer(customer);
        if (review.getCreatedDate() == null) {
            review.setCreatedDate(LocalDate.now());
        }
        return reviewService.createReview(review);
    }

    @DeleteMapping("/customer-reviews/{reviewId}")
    public void deleteReview(@PathVariable Long reviewId) {
        reviewService.deleteReview(reviewId);
    }
}
