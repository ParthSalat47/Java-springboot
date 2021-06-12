package com.example.courseapi.controller.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController     //all returns are automatically converted to json http response by spring MVC
public class TopicController {
    
    @Autowired  //coz this needs dependency injection
    private TopicService topicService;

    @RequestMapping("/topics")      //this uri is called a "path" in spring
    public List<Topic> getAllTopics()
    {
        return topicService.getAllTopics();
    
    }
    
    @RequestMapping("/topics/{foo}")     //{ } makes for a variable.
    public Topic getTopic(@PathVariable("foo") String id)  //Spring will find the variable in the path
    {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
    {
        topicService.updateTopic(topic, id);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic( @PathVariable String id)
    {
        topicService.deleteTopic(id);
    }

}
