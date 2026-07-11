
package com.CSC340.HobbyCircles.Review;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByCustomerCustomerId(Long customerId);
    List<Review> findByGroupId(Long groupId);
}