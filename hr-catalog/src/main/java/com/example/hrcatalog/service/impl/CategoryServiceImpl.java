package com.example.hrcatalog.service.impl;

import com.example.hrcatalog.model.Category;
import com.example.hrcatalog.repository.CategoryRepository;
import com.example.hrcatalog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) throws IllegalStateException {
        if (category.getId() != null){
            throw new IllegalStateException("document already exists");
        }
        return categoryRepository.save(category);
    }

    @Override
    public Category findById(Long id) throws IllegalStateException {
        if (id == null){
            throw new IllegalStateException("id is null");
        }
        return categoryRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) throws IllegalStateException {
        categoryRepository.deleteById(id);
    }
}
