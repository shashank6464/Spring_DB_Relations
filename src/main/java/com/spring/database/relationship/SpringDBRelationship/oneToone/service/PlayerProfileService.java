package com.spring.database.relationship.SpringDBRelationship.oneToone.service;

import com.spring.database.relationship.SpringDBRelationship.oneToone.entity.Player;
import com.spring.database.relationship.SpringDBRelationship.oneToone.entity.PlayerProfile;
import com.spring.database.relationship.SpringDBRelationship.oneToone.repository.PlayerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerProfileService {

    @Autowired
    PlayerProfileRepository playerProfileRepository;

    public List<PlayerProfile> getAllPlayersProfile(){
        return playerProfileRepository.findAll();
    }

    public PlayerProfile getPlayerProfileByID(@PathVariable("id") int id){
       return playerProfileRepository.findById(id).get();
    }

    public PlayerProfile addPlayerProfile(PlayerProfile playerProfile){
        return playerProfileRepository.save(playerProfile);
    }

    public void deletePlayerProfile(@PathVariable("id") int id){
        Optional<PlayerProfile> tempPlayerProfile = playerProfileRepository.findById(id);
        if(tempPlayerProfile.isEmpty())
            throw new RuntimeException("Player profile with "+id+" not found");
        playerProfileRepository.deleteById(id);
    }




}
