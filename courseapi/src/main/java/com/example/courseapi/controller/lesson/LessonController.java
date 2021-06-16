package com.example.courseapi.controller.lesson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonController {
    
    @Autowired
    private LessonService lessonService;

    @RequestMapping(method = RequestMethod.GET, value = "/topics/{topicId}/courses/{courseId}/lessons")
    public List<Lesson> getAllLessons(@PathVariable("courseId") String Id)
    {
        return lessonService.getAllLessons(Id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/topics/{topicId}/courses/{courseId}/lessons/{Id}")
    public Lesson getLesson(@PathVariable("Id") String Id)
    {
        return lessonService.getLesson(Id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses/{courseId}/lessons")
    public void addLesson(@RequestBody Lesson lesson)
    {
        lessonService.addLesson(lesson);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}/lessons/{Id}")
    public void updateLesson(@PathVariable("Id") String Id, Lesson lesson)
    {
        lessonService.updateLesson(Id, lesson); 
    }

    @RequestMapping( method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{courseId}/lessons/{Id}")
    public void updateLesson(@PathVariable("Id") String Id)
    {
        lessonService.deleteLesson(Id);
    }


}
