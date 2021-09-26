package com.example.base.service.impl;

import com.example.base.model.Student;
import com.example.base.repository.StudentRepo;
import com.example.base.service.iStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements iStudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public void createStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepo.deleteById(id);
    }

    @Override
    public List<Student> allStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<Student> studentById(Integer id) {
        return studentRepo.findById(id);
    }
}
