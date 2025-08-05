package com.example.lifeflow.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String member;
    private String choice;

    @ManyToOne
    @JoinColumn(name = "group_id")
    @JsonBackReference
    private Group group;

    public Vote() {}

    public Vote(String member, String choice) {
        this.member = member;
        this.choice = choice;
    }

    // Getter & Setter
    public Long getId() { return id; }
    public String getMember() { return member; }
    public void setMember(String member) { this.member = member; }
    public String getChoice() { return choice; }
    public void setChoice(String choice) { this.choice = choice; }
    public Group getGroup() { return group; }
    public void setGroup(Group group) { this.group = group; }
}