package com.CSC340.HobbyCircles.event;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByProviderProviderId(Long providerId);
}
