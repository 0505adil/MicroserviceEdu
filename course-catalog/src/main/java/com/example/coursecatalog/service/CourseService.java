package com.example.coursecatalog.service;

import com.example.coursecatalog.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course findById(Long id) throws IllegalStateException;
    Course save(Course course) throws IllegalStateException;
    Course update(Course course) throws IllegalStateException;
    void delete(Long id) throws IllegalStateException;
}
