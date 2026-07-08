
package com.CSC340.HobbyCircles.Rsvp;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RsvpService {
    private final RsvpRepository rsvpRepository;

    public RsvpService(RsvpRepository rsvpRepository) {
        this.rsvpRepository = rsvpRepository;
    }

    public List<Rsvp> getAllRsvps() {
        return rsvpRepository.findAll();
    }

    public Rsvp getRsvpById(Long rsvpId) {
        return rsvpRepository.findById(rsvpId).orElse(null);
    }

    public List<Rsvp> getRsvpsByCustomerId(Long customerId) {
        return rsvpRepository.findByCustomerCustomerId(customerId);
    }

    public List<Rsvp> getRsvpsByGroupId(Long groupId) {
        return rsvpRepository.findByGroupId(groupId);
    }

    public Rsvp createRsvp(Rsvp rsvp) {
        return rsvpRepository.save(rsvp);
    }

    public void deleteRsvp(Long rsvpId) {
        rsvpRepository.deleteById(rsvpId);
    }
}