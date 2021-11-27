package com.example.base.controller;

import com.example.base.model.Document;
import com.example.base.model.Teacher;
import com.example.base.service.iTeacherService;
import com.example.base.service.impl.TeacherService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/teachers")
@RestController
@AllArgsConstructor
public class TeacherController {

    private iTeacherService teacherService;

    @PostMapping("/add")
    public Object addTeacher(@RequestBody Teacher teacher){
        return teacherService.createTeacher(teacher);
    }

}
