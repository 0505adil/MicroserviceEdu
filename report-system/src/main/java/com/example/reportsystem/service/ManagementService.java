package com.example.reportsystem.service;


import com.example.reportsystem.model.Request;
import com.example.reportsystem.model.Response;
import org.springframework.stereotype.Service;

@Service
public class ManagementService {

    public Response get(Request request){
        return new Response();
    }
}
