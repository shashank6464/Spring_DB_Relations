package com.spring.database.relationship.SpringDBRelationship.oneToone.service;

import com.spring.database.relationship.SpringDBRelationship.oneToone.entity.Player;
import com.spring.database.relationship.SpringDBRelationship.oneToone.entity.PlayerProfile;
import com.spring.database.relationship.SpringDBRelationship.oneToone.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Player getPlayerByID(@PathVariable("id") int id){
       return playerRepository.findById(id).get();
    }

    public Player addPlayer(Player player){
        return playerRepository.save(player);
    }

    public void deletePlayer(@PathVariable("id") int id){
        Optional<Player> tempPlayer = playerRepository.findById(id);
        if(tempPlayer.isEmpty())
            throw new RuntimeException("Player with "+id+" not found");
        playerRepository.deleteById(id);
    }

    public Player assignProfile(int id, PlayerProfile profile){
        Player player = playerRepository.findById(id).get();

        player.setPlayerProfile(profile);

        return playerRepository.save(player);
    }
}
