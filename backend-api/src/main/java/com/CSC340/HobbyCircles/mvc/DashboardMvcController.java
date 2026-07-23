package com.CSC340.HobbyCircles.mvc;

import com.CSC340.HobbyCircles.event.EventService;
import com.CSC340.HobbyCircles.provider.ProviderService;
import com.CSC340.HobbyCircles.customerreview.ReviewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DashboardMvcController {

    private final ProviderService providerService;
    private final EventService eventService;
    private final ReviewService reviewService;

    public DashboardMvcController(
            ProviderService providerService,
            EventService eventService,
            ReviewService reviewService
    ) {
        this.providerService = providerService;
        this.eventService = eventService;
        this.reviewService = reviewService;
    }

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {

        model.addAttribute(
                "totalProviders",
                providerService.getAllProviders().size()
        );

        model.addAttribute(
                "totalEvents",
                eventService.getAllEvents().size()
        );


        model.addAttribute(
                "totalReviews",
                reviewService.getAllReviews().size()
        );

        return "dashboard";
    }


    
}