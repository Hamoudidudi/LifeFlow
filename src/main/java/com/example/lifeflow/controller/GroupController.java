package com.example.lifeflow.controller;

import com.example.lifeflow.model.GroupEntity;
import com.example.lifeflow.repository.GroupRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    private final GroupRepository groupRepository;

    public GroupController(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @PostMapping
    public GroupEntity createGroup(@RequestBody GroupEntity group) {
        return groupRepository.save(group);
    }

    @GetMapping
    public List<GroupEntity> getAllGroups() {
        return groupRepository.findAll();
    }
}