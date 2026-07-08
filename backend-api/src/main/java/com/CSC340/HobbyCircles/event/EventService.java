package com.CSC340.HobbyCircles.event;


import com.CSC340.HobbyCircles.provider.Provider;
import com.CSC340.HobbyCircles.provider.ProviderRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EventService {

    private final EventRepository eventRepository;
    private final ProviderRepository providerRepository;

    public EventService(EventRepository eventRepository, ProviderRepository providerRepository) {
        this.eventRepository = eventRepository;
        this.providerRepository = providerRepository;
    }


    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(Long eventId) {
        return eventRepository.findById(eventId).orElse(null);
    }

    public List<Event> getEventsByProvider(Long providerId) {
        return eventRepository.findByProviderProviderId(providerId);
    }


    public Event createEvent(Long providerId, Event event) {

        Provider provider = providerRepository.findById(providerId).orElse(null);

        if (provider == null) {
            return null;
        }

        event.setProvider(provider);
        return eventRepository.save(event);
    }

    public Event updateEvent(Long eventId, Event eventDetails) {

        Event event = getEventById(eventId);

        if (event == null) {
            return null;
        }

        event.setTitle(eventDetails.getTitle());
        event.setDescription(eventDetails.getDescription());
        event.setEventDate(eventDetails.getEventDate());
        event.setEventTime(eventDetails.getEventTime());
        event.setLocation(eventDetails.getLocation());
        event.setCategory(eventDetails.getCategory());
        event.setCapacity(eventDetails.getCapacity());
        event.setRsvpCount(eventDetails.getRsvpCount());

        return eventRepository.save(event);
    }

    public void deleteEvent(Long eventId) {
        eventRepository.deleteById(eventId);
    }

    
}