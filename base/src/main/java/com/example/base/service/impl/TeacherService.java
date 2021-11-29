package com.example.base.service.impl;

import com.example.base.config.KafkaSender;
import com.example.base.model.Document;
import com.example.base.model.Order;
import com.example.base.model.Teacher;
import com.example.base.repository.TeacherRepo;
import com.example.base.service.iTeacherService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TeacherService implements iTeacherService {

    @Autowired
    private TeacherRepo teacherRepo;
    @Autowired
    private RestTemplate restTemplate;

    private KafkaSender kafkaSender;

    @Override
    @HystrixCommand(fallbackMethod = "createFallback")
    public Object  createTeacher(Teacher teacher) {
        kafkaSender.sendMessage("Attemp to create Teacher", "topic-1");
        List<Document> doc = restTemplate.getForObject("http://localhost:8084/api/clients/employees", List.class);
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

    private String createFallback(Teacher teacher) {
        return "Cannot create teacher with name " + teacher.getName();
    }
}
