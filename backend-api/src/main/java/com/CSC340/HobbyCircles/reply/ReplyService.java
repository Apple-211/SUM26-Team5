package com.CSC340.HobbyCircles.reply;

import com.CSC340.HobbyCircles.review.Review;
import com.CSC340.HobbyCircles.review.ReviewRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ReplyService {

    private final ReplyRepository replyRepository;
    private final ReviewRepository reviewRepository;

    public ReplyService(ReplyRepository replyRepository,ReviewRepository reviewRepository) {
        this.replyRepository = replyRepository;
        this.reviewRepository = reviewRepository;
    }

    public List<Reply> getAllReplies() {
        return replyRepository.findAll();

    }

    public Reply getReplyById(Long replyId) {
        return replyRepository.findById(replyId).orElse(null);
    }

    public Reply createReply(Long reviewId, Reply reply) {

        Review review = reviewRepository.findById(reviewId).orElse(null);

        if (review == null) {
            return null;
        }

        reply.setReview(review);
        return replyRepository.save(reply);
    }

    public void deleteReply(Long replyId) {
        replyRepository.deleteById(replyId);
    }
    
}