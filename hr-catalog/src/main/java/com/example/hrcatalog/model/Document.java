package com.example.hrcatalog.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "documents")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;


    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;
}
