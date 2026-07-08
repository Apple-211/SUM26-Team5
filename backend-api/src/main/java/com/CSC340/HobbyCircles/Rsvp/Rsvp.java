
package com.CSC340.HobbyCircles.Rsvp;

import java.time.LocalDate;

import com.CSC340.HobbyCircles.Customer.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rsvps")
public class Rsvp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rsvpId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    // References the Group/Service entity owned by the provider side.
    private Long groupId;

    private LocalDate rsvpDate;

    public Rsvp() {
    }

    public Rsvp(Customer customer, Long groupId, LocalDate rsvpDate) {
        this.customer = customer;
        this.groupId = groupId;
        this.rsvpDate = rsvpDate;
    }

    public Long getRsvpId() {
        return rsvpId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public LocalDate getRsvpDate() {
        return rsvpDate;
    }

    public void setRsvpDate(LocalDate rsvpDate) {
        this.rsvpDate = rsvpDate;
    }
}