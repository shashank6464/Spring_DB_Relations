package com.spring.database.relationship.SpringDBRelationship.oneToone.repository;

import com.spring.database.relationship.SpringDBRelationship.oneToone.entity.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface PlayerProfileRepository extends JpaRepository<PlayerProfile,Integer> {
}
