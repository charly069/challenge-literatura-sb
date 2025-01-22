package com.alura.literalura.repository;

import com.alura.literalura.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(String author);

    List<Book> findByLanguage(String language);

    boolean existsByTitle(String title);
}
