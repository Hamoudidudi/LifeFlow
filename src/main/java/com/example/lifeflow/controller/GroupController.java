package com.example.lifeflow.controller;

import com.example.lifeflow.model.Group;
import com.example.lifeflow.model.Vote;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/groups")
public class GroupController {

    private List<Group> groups = new ArrayList<>(Arrays.asList(
            new Group(1, "Kinoabend"),
            new Group(2, "Dinner Night")
    ));

    // GET: Alle Gruppen abrufen
    @GetMapping
    public List<Group> getAllGroups() {
        return groups;
    }

    // POST: Neue Gruppe hinzufügen
    @PostMapping
    public Group addGroup(@RequestBody Group newGroup) {
        groups.add(newGroup);
        return newGroup;
    }

    // POST: Vote für eine Gruppe hinzufügen
    @PostMapping("/{id}/vote")
    public Group addVote(@PathVariable int id, @RequestBody Vote vote) {
        Group group = groups.stream().filter(g -> g.getId() == id).findFirst().orElse(null);
        if (group != null) {
            group.addVote(vote);
        }
        return group;
    }
}