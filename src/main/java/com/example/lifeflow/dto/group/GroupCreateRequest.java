package com.example.lifeflow.dto.group;

import jakarta.validation.constraints.NotBlank;

public class GroupCreateRequest {
    @NotBlank
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
