//this is to do all crud operations on database.


package com.example.courseapi.controller.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
    
    
}
