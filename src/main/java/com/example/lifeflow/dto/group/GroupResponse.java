package com.example.lifeflow.dto.group;

public class GroupResponse {
    private Long id;
    private String name;

    public GroupResponse(Long id, String name) {
        this.id = id; this.name = name;
    }
    public Long getId() { return id; }
    public String getName() { return name; }
}
