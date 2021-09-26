package com.example.base.service;

import com.example.base.model.Student;

import java.util.List;
import java.util.Optional;

public interface iStudentService {

    void createStudent(Student student);
    void deleteStudent(Integer id);
    List<Student> allStudents();
    Optional<Student> studentById(Integer id);
}
