package com.example.courseapi.controller.lesson;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getAllLessons(String courseId)
    {
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findByCourseId(courseId)
        .forEach(lessons::add);
        return lessons;
    }

    public Lesson getLesson(String Id) {
        return lessonRepository.findById(Id).get();
    }

    public void addLesson(Lesson lesson) {

        lessonRepository.save(lesson);
    }

    public void updateLesson(String id, Lesson lesson) {
        lessonRepository.save(lesson);          //add a delete method here
    }

    public void deleteLesson(String Id) {
        lessonRepository.deleteById(Id);
    }

    

    
}
