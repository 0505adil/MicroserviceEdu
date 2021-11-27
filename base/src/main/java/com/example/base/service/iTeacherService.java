package com.example.base.service;

import com.example.base.model.Document;
import com.example.base.model.Teacher;

import java.util.List;
import java.util.Optional;

public interface iTeacherService {
    Object createTeacher(Teacher teacher);
    void deleteTeacher(Integer id);
    List<Teacher> allTeachers();
    Optional<Teacher> teacherById(Integer id);
}
