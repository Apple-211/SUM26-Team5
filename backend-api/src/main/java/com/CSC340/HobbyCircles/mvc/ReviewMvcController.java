package com.CSC340.HobbyCircles.mvc;

import com.CSC340.HobbyCircles.review.ReviewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewMvcController {

    private final ReviewService reviewService;

    public ReviewMvcController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/reviews")
    public String showReviews(Model model) {

        model.addAttribute(
                "reviews",
                reviewService.getAllReviews()
        );

        return "reviews";

        
    }
}