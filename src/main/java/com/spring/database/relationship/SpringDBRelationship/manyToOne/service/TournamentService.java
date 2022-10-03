
package com.spring.database.relationship.SpringDBRelationship.manyToOne.service;

import com.spring.database.relationship.SpringDBRelationship.manyToOne.entity.Registration;
import com.spring.database.relationship.SpringDBRelationship.manyToOne.entity.Tournament;
import com.spring.database.relationship.SpringDBRelationship.manyToOne.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentService {

    @Autowired
    TournamentRepository tournamentRepository;

    public List<Tournament> getAllTournament(){
        return tournamentRepository.findAll();
    }

    public Tournament getTournamentById(int id){
        return tournamentRepository.findById(id).get();
    }

    public void deleteTournament(int id){
        tournamentRepository.deleteById(id);
    }

    public Tournament addTournament(Tournament tournament){
        return tournamentRepository.save(tournament);

    }

    public Tournament addRegistration(int id, Registration registration){
        Tournament tournament = tournamentRepository.findById(id).get();
        tournament.addRegistration(registration);
        return tournamentRepository.save(tournament);

    }

    public Tournament removeRegistration(int id, Registration registration){
        Tournament tournament = tournamentRepository.findById(id).get();
        tournament.removeRegistration(registration);
        return tournamentRepository.save(tournament);

    }




}
