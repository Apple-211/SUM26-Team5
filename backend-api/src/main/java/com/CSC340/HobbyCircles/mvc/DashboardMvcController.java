package com.CSC340.HobbyCircles.mvc;

import com.CSC340.HobbyCircles.customerreview.Review;
import com.CSC340.HobbyCircles.customerreview.ReviewService;
import com.CSC340.HobbyCircles.event.Event;
import com.CSC340.HobbyCircles.event.EventService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class DashboardMvcController {

    private final EventService eventService;
    private final ReviewService reviewService;

    public DashboardMvcController(
            EventService eventService,
            ReviewService reviewService
    ) {
        this.eventService = eventService;
        this.reviewService = reviewService;
    }

    @GetMapping("/dashboard")
    public String showDashboard(
            Model model,
            HttpSession session
    ) {
        Long providerId = (Long) session.getAttribute("providerId");

        if (providerId == null) {
            return "redirect:/provider";
        }

        List<Event> events = eventService.getEventsByProvider(providerId);

        int totalRsvps = events.stream()
                .mapToInt(Event::getRsvpCount)
                .sum();

        int totalReviews = 0;

        for (Review review : reviewService.getAllReviews()) {
            Long groupId = review.getGroupId();

            if (groupId != null) {
                Event event = eventService.getEventById(groupId);

                if (event != null
                        && event.getProvider() != null
                        && providerId.equals(event.getProvider().getProviderId())) {
                    totalReviews++;
                }
            }
        }

        model.addAttribute("totalEvents", events.size());
        model.addAttribute("totalRsvps", totalRsvps);
        model.addAttribute("totalReviews", totalReviews);

        return "dashboard";
    }
}