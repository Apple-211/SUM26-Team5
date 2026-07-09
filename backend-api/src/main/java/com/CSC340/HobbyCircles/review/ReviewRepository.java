package com.CSC340.HobbyCircles.review;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findByEventEventId(Long eventId);

    //this will return every review for a specific event so it's not confusing

}
