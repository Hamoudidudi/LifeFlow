package com.example.lifeflow.dto.vote;

public class VoteResponse {
    private Long id;
    private String voter;
    private Boolean choice;
    private Long groupId;

    public VoteResponse(Long id, String voter, Boolean choice, Long groupId) {
        this.id = id; this.voter = voter; this.choice = choice; this.groupId = groupId;
    }
    public Long getId() { return id; }
    public String getVoter() { return voter; }
    public Boolean getChoice() { return choice; }
    public Long getGroupId() { return groupId; }
}
