package com.example.courseapi.controller.course;


import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    //will be initialised at the beginning itself, ready to inject it's dependencies
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(String topicId)
    {
        //return courses;
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
        .forEach(courses::add);
        return courses;
    }    

    public Course getCourse(String id)
    {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course) 
    {
        courseRepository.save(course);
    }

    public void updateCourse(Course course, String id) {
        courseRepository.deleteById(id);
        courseRepository.save(course);
        
        
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
     

    }

        
}
