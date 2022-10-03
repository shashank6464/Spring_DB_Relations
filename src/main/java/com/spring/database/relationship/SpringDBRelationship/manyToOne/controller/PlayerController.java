package com.spring.database.relationship.SpringDBRelationship.manyToOne.controller;

import com.spring.database.relationship.SpringDBRelationship.manyToOne.entity.Player;
import com.spring.database.relationship.SpringDBRelationship.manyToOne.entity.PlayerProfile;
import com.spring.database.relationship.SpringDBRelationship.manyToOne.entity.Registration;
import com.spring.database.relationship.SpringDBRelationship.manyToOne.entity.Tournament;
import com.spring.database.relationship.SpringDBRelationship.manyToOne.service.PlayerProfileService;
import com.spring.database.relationship.SpringDBRelationship.manyToOne.service.PlayerService;
import com.spring.database.relationship.SpringDBRelationship.manyToOne.service.RegistrationService;
import com.spring.database.relationship.SpringDBRelationship.manyToOne.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @Autowired
    PlayerProfileService profileService;

    @Autowired
    RegistrationService registrationService;

    @Autowired
    TournamentService tournamentService;

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

    @PutMapping("/{id}/addRegistrations/{registration_id}")
    public Player addRegistration(@PathVariable int id, @PathVariable int registration_id){
        Registration registration  = registrationService.getRegistrationByID(registration_id);
        System.out.println(registration);
        return playerService.assignRegistration(id,registration);

    }

    @PutMapping("/{id}/removeRegistrations/{registration_id}")
    public Player removeRegistration(@PathVariable int id, @PathVariable int registration_id){
        Registration registration  = registrationService.getRegistrationByID(registration_id);
        System.out.println(registration);
        return playerService.removeRegistration(id,registration);

    }

//    public Player assignProfile(int id, PlayerProfile profile){
//        Player player = playerRepository.findById(id).get();
//
//        player.setPlayerProfile(profile);
//
//        return playerRepository.save(player);
//    }
}
