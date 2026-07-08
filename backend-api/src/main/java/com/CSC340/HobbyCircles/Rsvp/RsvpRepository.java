
package com.CSC340.HobbyCircles.Rsvp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RsvpRepository extends JpaRepository<Rsvp, Long> {
    List<Rsvp> findByCustomerCustomerId(Long customerId);
    List<Rsvp> findByGroupId(Long groupId);
}