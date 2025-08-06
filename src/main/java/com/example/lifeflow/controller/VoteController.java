package com.example.lifeflow.controller;

import com.example.lifeflow.model.Vote;
import com.example.lifeflow.model.GroupEntity;
import com.example.lifeflow.repository.VoteRepository;
import com.example.lifeflow.repository.GroupRepository;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/votes")
public class VoteController {

    private final VoteRepository voteRepository;
    private final GroupRepository groupRepository;

    public VoteController(VoteRepository voteRepository, GroupRepository groupRepository) {
        this.voteRepository = voteRepository;
        this.groupRepository = groupRepository;
    }

    @PostMapping
    public Vote createVote(@RequestBody Vote vote) {
        GroupEntity group = groupRepository.findById(vote.getGroup().getId()).orElseThrow();
        vote.setGroup(group);
        return voteRepository.save(vote);
    }

    @GetMapping
    public List<Vote> getAllVotes() {
        return voteRepository.findAll();
    }
    }