package com.example.lifeflow.controller;

import com.example.lifeflow.model.Group;
import com.example.lifeflow.repository.GroupRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    private final GroupRepository groupRepository;

    // ✅ Constructor Injection
    public GroupController(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    // GET: Alle Gruppen abrufen
    @GetMapping
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    // POST: Neue Gruppe hinzufügen
    @PostMapping
    public Group addGroup(@RequestBody Group newGroup) {
        return groupRepository.save(newGroup);
    }
}