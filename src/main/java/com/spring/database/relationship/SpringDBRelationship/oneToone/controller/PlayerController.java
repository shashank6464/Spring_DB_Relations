package com.spring.database.relationship.SpringDBRelationship.oneToone.controller;

import com.spring.database.relationship.SpringDBRelationship.oneToone.entity.Player;
import com.spring.database.relationship.SpringDBRelationship.oneToone.entity.PlayerProfile;
import com.spring.database.relationship.SpringDBRelationship.oneToone.service.PlayerProfileService;
import com.spring.database.relationship.SpringDBRelationship.oneToone.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @Autowired
    PlayerProfileService profileService;

    @GetMapping
    public List<Player> getAllPlayers(){
              return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public Player getPlayerByID(@PathVariable int id){
        return playerService.getPlayerByID(id);
    }

    @PostMapping("/addPlayer")
    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }

    @DeleteMapping("/deletePlayer/{id}")
    public void deletePlayer(@PathVariable int id){
        playerService.deletePlayer(id);
    }

    //one-to-one relationship
    @PutMapping("/{id}/profiles/{profile_id}")
    public Player assignDetails (@PathVariable int id, @PathVariable int profile_id){
        PlayerProfile playerProfile = profileService.getPlayerProfileByID(profile_id);
        System.out.println(playerProfile);
        return playerService.assignProfile(id,playerProfile);
    }

//    public Player assignProfile(int id, PlayerProfile profile){
//        Player player = playerRepository.findById(id).get();
//
//        player.setPlayerProfile(profile);
//
//        return playerRepository.save(player);
//    }
}
