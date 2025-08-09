package com.example.lifeflow.dto.vote;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class VoteCreateRequest {
    @NotBlank
    private String voter;

    @NotNull
    private Boolean choice;

    @NotNull
    private Long groupId;

    public String getVoter() { return voter; }
    public void setVoter(String voter) { this.voter = voter; }
    public Boolean getChoice() { return choice; }
    public void setChoice(Boolean choice) { this.choice = choice; }
    public Long getGroupId() { return groupId; }
    public void setGroupId(Long groupId) { this.groupId = groupId; }
}
