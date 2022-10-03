package com.spring.database.relationship.SpringDBRelationship.manyToOne.service;


import com.spring.database.relationship.SpringDBRelationship.manyToOne.entity.Registration;
import com.spring.database.relationship.SpringDBRelationship.manyToOne.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;

    public List<com.spring.database.relationship.SpringDBRelationship.manyToOne.entity.Registration> findAllRegistration(){
        return registrationRepository.findAll();
    }

    public com.spring.database.relationship.SpringDBRelationship.manyToOne.entity.Registration getRegistrationByID(int id){
        return registrationRepository.findById(id).get();
    }

    public void deleteRegistration(int id){
        registrationRepository.deleteById(id);
    }

    public com.spring.database.relationship.SpringDBRelationship.manyToOne.entity.Registration addRegistration(Registration registration){
        return registrationRepository.save(registration);
    }



}