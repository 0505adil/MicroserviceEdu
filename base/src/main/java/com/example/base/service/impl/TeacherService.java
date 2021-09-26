package com.example.base.service.impl;

import com.example.base.model.Document;
import com.example.base.model.Order;
import com.example.base.model.Teacher;
import com.example.base.repository.TeacherRepo;
import com.example.base.service.iTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService implements iTeacherService {

    @Autowired
    private TeacherRepo teacherRepo;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Document>  createTeacher(Teacher teacher) {
        List<Document> doc = restTemplate.getForObject("http://localhost:8082/api/clients/employees", List.class);
        Order order = new Order(null, "Teacher Salary", "150000");
        String resFinance = restTemplate.postForObject("http://localhost:8083/finance/create", order, String.class  );
        teacherRepo.save(teacher);
        return doc;
    }

    @Override
    public void deleteTeacher(Integer id) {
        teacherRepo.deleteById(id);
    }

    @Override
    public List<Teacher> allTeachers() {
        return teacherRepo.findAll();
    }

    @Override
    public Optional<Teacher> teacherById(Integer id) {
        return teacherRepo.findById(id);
    }
}
