
package com.CSC340.HobbyCircles.Rsvp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CSC340.HobbyCircles.Customer.Customer;
import com.CSC340.HobbyCircles.Customer.CustomerService;

@RestController
@RequestMapping("/api")
public class RsvpController {
    private final RsvpService rsvpService;
    private final CustomerService customerService;

    public RsvpController(RsvpService rsvpService, CustomerService customerService) {
        this.rsvpService = rsvpService;
        this.customerService = customerService;
    }

    @GetMapping("/rsvps")
    public List<Rsvp> getAllRsvps() {
        return rsvpService.getAllRsvps();
    }

    @GetMapping("/customers/{customerId}/rsvps")
    public List<Rsvp> getRsvpsByCustomer(@PathVariable Long customerId) {
        return rsvpService.getRsvpsByCustomerId(customerId);
    }

    // Join a group / rsvp. Body only needs { "groupId": X }
    @PostMapping("/customers/{customerId}/rsvps")
    public Rsvp createRsvp(@PathVariable Long customerId, @RequestBody Rsvp rsvp) {
        Customer customer = customerService.getCustomerById(customerId);
        if (customer == null) {
            return null;
        }
        rsvp.setCustomer(customer);
        if (rsvp.getRsvpDate() == null) {
            rsvp.setRsvpDate(LocalDate.now());
        }
        return rsvpService.createRsvp(rsvp);
    }

    @DeleteMapping("/rsvps/{rsvpId}")
    public void deleteRsvp(@PathVariable Long rsvpId) {
        rsvpService.deleteRsvp(rsvpId);
    }
}