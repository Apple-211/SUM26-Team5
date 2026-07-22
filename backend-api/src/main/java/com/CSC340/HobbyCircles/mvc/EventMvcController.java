package com.CSC340.HobbyCircles.mvc;

import com.CSC340.HobbyCircles.event.Event;
import com.CSC340.HobbyCircles.event.EventService;
import com.CSC340.HobbyCircles.provider.ProviderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EventMvcController {

    private final EventService eventService;
    private final ProviderService providerService;

    public EventMvcController(EventService eventService, ProviderService providerService) {

        this.eventService = eventService;
        this.providerService = providerService;
    }

    @GetMapping("/create-event")
    public String showCreateEventPage(Model model) {
        model.addAttribute(
                "providers",
                providerService.getAllProviders()
        );

        return "create-event";
    }

    @PostMapping("/create-event")
    public String createEvent(@RequestParam Long providerId, @ModelAttribute Event event) {

        eventService.createEvent(providerId, event);

        return "redirect:/create-event";
    }

//added new code 

    @GetMapping("/my-events")
public String showMyEvents(
        @RequestParam(required = false) Long providerId,
        Model model
) {

    model.addAttribute(
            "providers",
            providerService.getAllProviders()
    );

    if (providerId != null) {
        var events = eventService.getEventsByProvider(providerId);

        int totalRsvps = events.stream()
                .mapToInt(Event::getRsvpCount)
                .sum();

        model.addAttribute("events", events);
        model.addAttribute("selectedProviderId", providerId);
        model.addAttribute("totalEvents", events.size());
        model.addAttribute("totalRsvps", totalRsvps);
    }

    return "my-events";
}

}


