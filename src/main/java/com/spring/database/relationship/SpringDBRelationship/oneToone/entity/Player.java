package com.spring.database.relationship.SpringDBRelationship.oneToone.entity;

import javax.persistence.*;

@Entity
public class Player {

    //@Id give primary key
    //@GeneratedValue gives auto generated value
    @Id
    @GeneratedValue
    private int id;

    //@Column
    private String name;

    //building (one-to-one) join column => unidirectional one to one relationship
    // with playerprofile object into player
    //and we are setting profile id with referenced column id of playerprofile
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private PlayerProfile playerProfile;

    public Player(){

    }

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Player(int id, String name, PlayerProfile playerProfile) {
        this.id = id;
        this.name = name;
        this.playerProfile = playerProfile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerProfile getPlayerProfile() {
        return playerProfile;
    }

    public void setPlayerProfile(PlayerProfile playerProfile) {
        this.playerProfile = playerProfile;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", playerProfile=" + playerProfile +
                '}';
    }
}
