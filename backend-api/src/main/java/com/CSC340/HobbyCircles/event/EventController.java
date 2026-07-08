package com.CSC340.HobbyCircles.event;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;

    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{eventId}")
    public Event getEventById(@PathVariable Long eventId) {
        return eventService.getEventById(eventId);
    }

    @GetMapping("/provider/{providerId}")
    public List<Event> getEventsByProvider(@PathVariable Long providerId) {
        return eventService.getEventsByProvider(providerId);
    }

    @GetMapping("/provider/{providerId}/calendar")
    public List<Event> getProviderCalendar(@PathVariable Long providerId) {
        return eventService.getEventsByProvider(providerId);
    }

    @PostMapping("/provider/{providerId}")
    public Event createEvent(@PathVariable Long providerId, @RequestBody Event event) {
        return eventService.createEvent(providerId, event);
    }

    @PutMapping("/{eventId}")
    public Event updateEvent(@PathVariable Long eventId, @RequestBody Event event) {
        return eventService.updateEvent(eventId, event);
    }

    @DeleteMapping("/{eventId}")
    public void deleteEvent(@PathVariable Long eventId) {
        eventService.deleteEvent(eventId);

    }

    
}