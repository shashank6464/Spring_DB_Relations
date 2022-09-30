package com.spring.database.relationship.SpringDBRelationship.oneToone.entity;

import javax.persistence.*;

@Entity
public class PlayerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String instaProfile;

    public PlayerProfile() {
    }

    public PlayerProfile(int id, String instaProfile) {
        this.id = id;
        this.instaProfile = instaProfile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstaProfile() {
        return instaProfile;
    }

    public void setInstaProfile(String instaProfile) {
        this.instaProfile = instaProfile;
    }

    @Override
    public String toString() {
        return "PlayerProfile{" +
                "id=" + id +
                ", instaProfile='" + instaProfile + '\'' +
                '}';
    }
}
