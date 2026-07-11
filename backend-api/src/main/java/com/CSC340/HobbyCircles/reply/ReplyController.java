package com.CSC340.HobbyCircles.reply;

import org.springframework.web.bind.annotation.*;
import java.util.List;




@RestController
@RequestMapping("/api/replies")
public class ReplyController {

    private final ReplyService replyService;

    public ReplyController(ReplyService replyService) {
        this.replyService = replyService;
    }

    @GetMapping
    public List<Reply> getAllReplies() {
        return replyService.getAllReplies();
    }

    @GetMapping("/{replyId}")
    public Reply getReplyById(@PathVariable Long replyId) {
        return replyService.getReplyById(replyId);
    }

    @PostMapping("/review/{reviewId}")
    public Reply createReply(@PathVariable Long reviewId, @RequestBody Reply reply) {
        return replyService.createReply(reviewId, reply);
    }

    @DeleteMapping("/{replyId}")
    public void deleteReply(@PathVariable Long replyId) {
        replyService.deleteReply(replyId);
    }
}
