package com.example.hrcatalog.service.impl;

import com.example.hrcatalog.model.Document;
import com.example.hrcatalog.repository.DocumentRepository;
import com.example.hrcatalog.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {


    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public List<Document> findAllByCategoryId(Long categoryId) {
        return documentRepository.findAllByCategory_Id(categoryId);
    }

    @Override
    public Document save(Document document) throws IllegalStateException {
        if (document.getId() != null){
            throw new IllegalStateException("document already exists");
        }
        return documentRepository.save(document);
    }
}
