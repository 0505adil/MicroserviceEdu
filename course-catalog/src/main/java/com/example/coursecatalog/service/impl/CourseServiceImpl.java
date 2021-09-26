package com.example.coursecatalog.service.impl;

import com.example.coursecatalog.model.Course;
import com.example.coursecatalog.repository.CourseRepository;
import com.example.coursecatalog.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public Course save(Course course) {
        if(course.getCourseId() != null){
            throw new IllegalStateException("course already exists");
        }
        return  courseRepository.save(course);
    }

    @Override
    public Course update(Course course) {
        if(course.getCourseId() == null){
            throw new IllegalStateException("course is null");
        }
        return  courseRepository.save(course);
    }

    @Override
    public void delete(Long id) {
        courseRepository.deleteById(id);
    }
}
