package com.spring.database.relationship.SpringDBRelationship.manyToOne.repository;

import com.spring.database.relationship.SpringDBRelationship.manyToOne.entity.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerProfileRepository extends JpaRepository<PlayerProfile,Integer> {
}
