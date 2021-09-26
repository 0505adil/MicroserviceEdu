package com.example.hrcatalog.service;

import com.example.hrcatalog.model.Category;

import java.util.List;

public interface CategoryService {
    Category save(Category category) throws IllegalStateException;
    Category findById(Long id) throws IllegalStateException;
    void delete(Long id) throws IllegalStateException;
}
