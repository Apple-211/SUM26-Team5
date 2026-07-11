package com.CSC340.HobbyCircles.review;

import com.CSC340.HobbyCircles.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    private String reviewerName;

    private int rating;

    private String comment;

    private String reviewDate;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    
}
