package com.example.lifeflow.model;



import jakarta.persistence.*;

@Entity
@Table(name = "votes")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String voter;
    private boolean choice;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private GroupEntity group;

    // Getter/Setter
    public Long getId() { return id; }
    public String getVoter() { return voter; }
    public void setVoter(String voter) { this.voter = voter; }
    public boolean isChoice() { return choice; }
    public void setChoice(boolean choice) { this.choice = choice; }
    public GroupEntity getGroup() { return group; }
    public void setGroup(GroupEntity group) { this.group = group; }
}
