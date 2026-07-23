package com.CSC340.HobbyCircles.mvc;

import com.CSC340.HobbyCircles.customerreview.Review;
import com.CSC340.HobbyCircles.customerreview.ReviewService;
import com.CSC340.HobbyCircles.event.Event;
import com.CSC340.HobbyCircles.event.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ReviewMvcController {

    private final ReviewService reviewService;
    private final EventService eventService;

    public ReviewMvcController(
            ReviewService reviewService,
            EventService eventService
    ) {
        this.reviewService = reviewService;
        this.eventService = eventService;
    }

    @GetMapping("/reviews")
    public String showReviews(Model model) {

        List<Review> reviews = reviewService.getAllReviews();
        reviews.sort((r1, r2) -> r2.getCreatedDate().compareTo(r1.getCreatedDate())); //maybe this will work
        Map<String, String> eventTitles = new HashMap<>();

        for (Review review : reviews) {
            Long groupId = review.getGroupId();

            if (groupId != null) {
                Event event = eventService.getEventById(groupId);

                if (event != null) {
                    eventTitles.put(
                            groupId.toString(),
                            event.getTitle()
                    );
                }
            }
        }

        model.addAttribute("reviews", reviews);
        model.addAttribute("eventTitles", eventTitles);

        return "reviews";
    }
}