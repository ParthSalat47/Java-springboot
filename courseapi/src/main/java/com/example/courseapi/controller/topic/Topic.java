package com.example.courseapi.controller.topic;

//here's a topic model object
public class Topic {

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
