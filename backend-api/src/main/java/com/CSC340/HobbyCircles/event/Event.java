package com.CSC340.HobbyCircles.event;


//Host should be able to create many events as they like + how many rsvp 

import com.CSC340.HobbyCircles.provider.Provider;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    @Column(nullable = false)
    private String title;

    private String description;

    private String eventDate;

    private String eventTime;

    private String location;

    private String category;

    private int capacity;

    private int rsvpCount;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

}