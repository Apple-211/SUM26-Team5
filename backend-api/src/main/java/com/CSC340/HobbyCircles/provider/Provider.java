package com.CSC340.HobbyCircles.provider;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "providers")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long providerId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    private String interests;

    private String description;

    private String location;
}
