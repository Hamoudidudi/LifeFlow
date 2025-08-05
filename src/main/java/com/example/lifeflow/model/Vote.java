package com.example.lifeflow.model;

public class Vote {
    private String member;    // Wer hat abgestimmt? z.B. "Ali"
    private String choice;     // Was hat er gewählt? z.B. "Film A"

    public Vote(String member, String choice) {
        this.member = member;
        this.choice = choice;
    }

    public String getMember() { return member; }
    public String getChoice() { return choice; }
}