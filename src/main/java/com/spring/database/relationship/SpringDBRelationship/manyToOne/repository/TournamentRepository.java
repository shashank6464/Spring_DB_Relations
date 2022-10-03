package com.spring.database.relationship.SpringDBRelationship.manyToOne.repository;

import com.spring.database.relationship.SpringDBRelationship.manyToOne.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament,Integer> {
}
