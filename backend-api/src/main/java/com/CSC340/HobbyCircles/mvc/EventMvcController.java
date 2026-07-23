package com.CSC340.HobbyCircles.mvc;

import com.CSC340.HobbyCircles.event.Event;
import com.CSC340.HobbyCircles.event.EventService;
import com.CSC340.HobbyCircles.provider.Provider;
import com.CSC340.HobbyCircles.provider.ProviderService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class EventMvcController {

    private final EventService eventService;
    private final ProviderService providerService;


    public EventMvcController(
            EventService eventService,
            ProviderService providerService
    ) {
        this.eventService = eventService;
        this.providerService = providerService;
    }

    @GetMapping("/create-event")
    public String showCreateEventPage(
            Model model,
            HttpSession session
    ) {
        Long providerId = (Long) session.getAttribute("providerId");

        if (providerId == null) {
            return "redirect:/provider";
        }

        Provider provider = providerService.getProviderById(providerId);

        if (provider == null) {
            return "redirect:/provider";
        }

        model.addAttribute("provider", provider);

        return "create-event";
    }

    
    @PostMapping("/create-event")
    public String createEvent(
            @ModelAttribute Event event,
            HttpSession session
    ) {
        Long providerId = (Long) session.getAttribute("providerId");

        if (providerId == null) {
            return "redirect:/provider";
        }

        eventService.createEvent(providerId, event);

        return "redirect:/my-events";
    }

    @GetMapping("/my-events")
    public String showMyEvents(
            Model model,
            HttpSession session
    ) {
        Long providerId = (Long) session.getAttribute("providerId");

        if (providerId == null) {
            return "redirect:/provider";
        }

        var events = eventService.getEventsByProvider(providerId);

        int totalRsvps = events.stream()
                .mapToInt(Event::getRsvpCount)
                .sum();

        model.addAttribute("events", events);
        model.addAttribute("totalEvents", events.size());
        model.addAttribute("totalRsvps", totalRsvps);

        return "my-events";
    }
}


