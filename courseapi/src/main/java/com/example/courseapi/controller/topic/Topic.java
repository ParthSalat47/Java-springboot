package com.example.courseapi.controller.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

//here's a topic model object - which now becomes a table
@Entity //to make it a table
public class Topic {

    @Id     //to make id as primary key
    private String id;
    private String name;
    private String description;

    public Topic() {
        // Here's a no args constructor, just so that the object is easier to
        // initialise.
    }

    public Topic(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
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

}
