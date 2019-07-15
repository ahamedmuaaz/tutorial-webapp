package com.tutorial.web.service;




import com.tutorial.web.data.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {

     public Tutorial findById(int id);

    //public List<Tutorial> findByLastName(String lastName);


}
