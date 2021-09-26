package com.example.hrcatalog.service;

import com.example.hrcatalog.model.Document;

import java.util.List;

public interface DocumentService {
    List<Document> findAllByCategoryId(Long categoryId) throws IllegalStateException;
    Document save(Document document) throws IllegalStateException;
}
