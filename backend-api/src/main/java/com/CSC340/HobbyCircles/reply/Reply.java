package com.CSC340.HobbyCircles.reply;

import com.CSC340.HobbyCircles.review.Review;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "replies")
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyId;

    private String providerReply;

    private String replyDate;

    @OneToOne
    @JoinColumn(name = "review_id")
    private Review review;
}
