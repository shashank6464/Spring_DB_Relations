package oneToMany.service;


import oneToMany.entity.Registration;
import oneToMany.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;

    public List<Registration> findAllRegistration(){
        return registrationRepository.findAll();
    }

    public Registration getRegistrationByID(int id){
        return registrationRepository.findById(id).get();
    }

    public void deleteRegistration(int id){
         registrationRepository.deleteById(id);
    }

    public Registration addRegistration(Registration registration){
        return registrationRepository.save(registration);
    }



}
