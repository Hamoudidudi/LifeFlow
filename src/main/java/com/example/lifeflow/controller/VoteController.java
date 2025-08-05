package com.example.lifeflow.controller;

import com.example.lifeflow.model.Vote;
import com.example.lifeflow.repository.VoteRepository;



import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/votes")
public class VoteController {

    private final VoteRepository voteRepository;

    public VoteController(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @GetMapping
    public List<Vote> getAllVotes() {
        return voteRepository.findAll();
    }

    @PostMapping
    public Vote addVote(@RequestBody Vote newVote) {
        return voteRepository.save(newVote);
    }
}