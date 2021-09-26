package com.example.hrcatalog.repository;

import com.example.hrcatalog.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document,Long> {

    List<Document> findAllByCategory_Id(Long id);
}
