package com.spring.database.relationship.SpringDBRelationship.oneToone.repository;

import com.spring.database.relationship.SpringDBRelationship.oneToone.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {
}
