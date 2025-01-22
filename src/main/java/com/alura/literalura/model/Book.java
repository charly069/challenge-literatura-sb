package com.alura.literalura.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String language;
    private Integer publicationYear;
    private boolean isAuthorAlive;
}
