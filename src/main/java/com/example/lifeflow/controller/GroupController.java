package com.example.lifeflow.controller;

import com.example.lifeflow.dto.group.GroupCreateRequest;
import com.example.lifeflow.dto.group.GroupResponse;
import com.example.lifeflow.model.GroupEntity;
import com.example.lifeflow.repository.GroupRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {
    private final GroupRepository groupRepository;
    public GroupController(GroupRepository groupRepository) { this.groupRepository = groupRepository; }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GroupResponse create(@Valid @RequestBody GroupCreateRequest req) {
        GroupEntity g = new GroupEntity();
        g.setName(req.getName());
        GroupEntity saved = groupRepository.save(g);
        return new GroupResponse(saved.getId(), saved.getName());
    }

    @GetMapping
    public List<GroupResponse> list() {
        return groupRepository.findAll().stream()
                .map(g -> new GroupResponse(g.getId(), g.getName()))
                .toList();
    }
}
