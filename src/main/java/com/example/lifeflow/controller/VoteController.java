package com.example.lifeflow.controller;

import com.example.lifeflow.dto.vote.VoteCreateRequest;
import com.example.lifeflow.dto.vote.VoteResponse;
import com.example.lifeflow.model.GroupEntity;
import com.example.lifeflow.model.Vote;
import com.example.lifeflow.error.ResourceNotFoundException;
import com.example.lifeflow.repository.GroupRepository;
import com.example.lifeflow.repository.VoteRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
    public VoteResponse create(@Valid @RequestBody VoteCreateRequest req) {
        GroupEntity group = groupRepository.findById(req.getGroupId())
                .orElseThrow(() -> new ResourceNotFoundException("Group not found: id=" + req.getGroupId()));

        Vote v = new Vote();
        v.setVoter(req.getVoter());
        v.setChoice(req.getChoice());
        v.setGroup(group);

        Vote saved = voteRepository.save(v);
        return new VoteResponse(saved.getId(), saved.getVoter(), saved.getChoice(), saved.getGroup().getId());
    }

    @GetMapping
    public List<VoteResponse> list() {
        return voteRepository.findAll().stream()
                .map(v -> new VoteResponse(v.getId(), v.getVoter(), v.getChoice(), v.getGroup().getId()))
                .toList();
    }
}
