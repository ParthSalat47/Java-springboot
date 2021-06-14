package com.example.courseapi.controller.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.courseapi.controller.topic.Topic;

@Entity
public class Course {
    
    @Id     //to make id as primary key
    private String id;
    private String name;
    private String description;
    @ManyToOne
    private Topic topic;

    public Course() {
        // Here's a no args constructor, just so that the object is easier to
        // initialise.
    }

    public Course(String id, String name, String description, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}
