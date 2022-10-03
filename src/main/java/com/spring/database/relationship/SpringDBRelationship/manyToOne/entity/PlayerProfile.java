package com.spring.database.relationship.SpringDBRelationship.manyToOne.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlayerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String instaProfile;


    public PlayerProfile() {
    }

    public PlayerProfile(int id, String instaProfile) {
        super();
        this.id = id;
        this.instaProfile = instaProfile;
    }

//    public PlayerProfile(int id, String instaProfile, Player player) {
//        this.id = id;
//        this.instaProfile = instaProfile;
//        this.player = player;
//    }



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
