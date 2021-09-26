package com.example.hrcatalog.controller;

import com.example.hrcatalog.model.Document;
import com.example.hrcatalog.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/clients")
public class ClientController {

    private DocumentService documentService;

    @Autowired
    public ClientController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/clients")
    public List<Document> findAllDocumentsByClients(){
        return documentService.findAllByCategoryId(1L);
    }

    @GetMapping("/employees")
    public List<Document> findAllDocumentsForEmployees(){
        return documentService.findAllByCategoryId(2L);
    }
}
