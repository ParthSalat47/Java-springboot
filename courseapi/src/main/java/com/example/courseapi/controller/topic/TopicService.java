package com.example.courseapi.controller.topic;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    //will be initialised at the beginning itself, ready to inject it's dependencies
public class TopicService {
    
    @Autowired
    private TopicRepository topicRepository;

    /* private List<Topic> topics = new ArrayList<>(Arrays.asList(   
        new Topic("spring", "spring framework", "spring framework description"),
        new Topic("python", "django", "django docs"),
        new Topic("donkey", "donkey framework", "no desc. needed!")

        )); */

    public List<Topic> getAllTopics()
    {
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
        .forEach(topics::add);
        return topics;
    }    

    public Topic getTopic(String id)
    {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) 
    {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.deleteById(id);
        topicRepository.save(topic);
        
        /* for(int i=0; i<topics.size(); i++)
        {
            Topic t = topics.get(i);
            if (t.getId().equals(id))
            {
                topics.set(i, topic);
                return;
            }
        } */

    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
        //topics.removeIf(t -> t.getId().equals(id));

    }

        
}
