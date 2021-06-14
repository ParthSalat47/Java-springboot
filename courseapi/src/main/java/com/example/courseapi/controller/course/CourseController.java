package com.example.courseapi.controller.course;

import java.util.List;

import com.example.courseapi.controller.topic.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController     //all returns are automatically converted to json http response by spring MVC
public class CourseController {
    
    @Autowired  //coz this needs dependency injection
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")      //this uri is called a "path" in spring
    public List<Course> getAllCourses(@PathVariable("id") String id)
    {
        return courseService.getAllCourses(id);
    
    }
    
    @RequestMapping("/topics/{topicId}/courses/{foo}")     //{ } makes for a variable.
    public Course getCourse(@PathVariable("foo") String id)  //Spring will find the variable in the path
    {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId)
    {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId)
    {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course, id);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
    public void deleteCourse( @PathVariable String id)
    {
        courseService.deleteCourse(id);
    }

}
