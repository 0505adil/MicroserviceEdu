package com.example.base.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {

    private Long id;
    private String name;
    private Long category;
}

