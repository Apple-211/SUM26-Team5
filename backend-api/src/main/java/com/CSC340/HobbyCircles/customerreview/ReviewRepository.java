
package com.CSC340.HobbyCircles.customerreview;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository("customerReviewRepository")
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByCustomerCustomerId(Long customerId);
    List<Review> findByGroupId(Long groupId);
}