package com.example.lifeflow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "votes")
public class Vote {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String voter;

    @Column(nullable = false)
    private Boolean choice;

    @ManyToOne(optional = false)
    @JoinColumn(name = "group_id", nullable = false)
    private GroupEntity group;

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getVoter() { return voter; }
    public void setVoter(String voter) { this.voter = voter; }
    public Boolean getChoice() { return choice; }
    public void setChoice(Boolean choice) { this.choice = choice; }
    public GroupEntity getGroup() { return group; }
    public void setGroup(GroupEntity group) { this.group = group; }
}
