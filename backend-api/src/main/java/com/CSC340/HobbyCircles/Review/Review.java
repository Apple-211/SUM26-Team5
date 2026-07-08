
package com.CSC340.HobbyCircles.Review;

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
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    // References the Group/Service entity owned by the provider side.
    private Long groupId;

    private int rating;
    private String comment;
    private LocalDate createdDate;

    // Filled in later by the provider side via PUT, not set on creation.
    private String replyText;

    public Review() {
    }

    public Review(Customer customer, Long groupId, int rating, String comment, LocalDate createdDate) {
        this.customer = customer;
        this.groupId = groupId;
        this.rating = rating;
        this.comment = comment;
        this.createdDate = createdDate;
    }

    public Long getReviewId() {
        return reviewId;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getReplyText() {
        return replyText;
    }

    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }
}