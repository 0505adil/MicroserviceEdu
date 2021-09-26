package com.example.reportsystem.controller;

import com.example.reportsystem.model.Request;
import com.example.reportsystem.model.Response;
import com.example.reportsystem.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/report")
public class MainController {

    @Autowired
    private ManagementService managementService;

    @PostMapping
    public Response get(@RequestBody Request request){
        return managementService.get(request);
    }
}
