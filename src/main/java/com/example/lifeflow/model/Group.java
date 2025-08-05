package com.example.lifeflow.model;

import java.util.ArrayList;
import java.util.*;

public class Group {
    private int id;   //Anzahl der Mitglieder der Group
    private String name;   //Name der Veranstalltung oder Unternehmung
    private List<String> members = new ArrayList<>();   //Liste der Mitglieder [Ali, Hamoudi, Gafoura]
    private List<Vote> votes = new ArrayList<>();     // Liste von Abstimmungen (siehe Vote.java)

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public List<String> getMembers() { return members; }
    public List<Vote> getVotes() { return votes; }

    public void addMember(String member) {
        members.add(member);
    }

    public void addVote(Vote vote) {
        votes.add(vote);
    }
}