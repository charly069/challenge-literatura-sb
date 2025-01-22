package com.alura.literalura.service;

import com.alura.literalura.model.Book;
import com.alura.literalura.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final RestTemplate restTemplate;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        this.restTemplate = new RestTemplate();
    }

    public void searchAndSaveBookByTitle(String title) {
        if (bookRepository.existsByTitle(title)) {
            System.out.println("El libro ya está registrado.");
            return;
        }

        String apiUrl = "https://gutendex.com/books/?search=" + title;
        try {
            String response = restTemplate.getForObject(apiUrl, String.class);
            // Parsear JSON y guardar en la base de datos (por implementar)
            System.out.println("Libro encontrado y registrado: " + title);
        } catch (Exception e) {
            System.out.println("No se encontraron libros con el título proporcionado.");
        }
    }

    public void listBooksByAuthor(String author) {
        List<Book> books = bookRepository.findByAuthor(author);
        if (books.isEmpty()) {
            System.out.println("No hay libros registrados para este autor.");
        } else {
            books.forEach(System.out::println);
        }
    }

    public void listAllAuthors() {
        // Implementar lógica para listar autores únicos
        System.out.println("Lista de autores registrados: (por implementar)");
    }

    public void listLivingAuthorsByYear(int year) {
        // Implementar lógica para filtrar autores vivos en un año
        System.out.println("Autores vivos en el año " + year + ": (por implementar)");
    }

    public void listBooksByLanguage(String language) {
        List<Book> books = bookRepository.findByLanguage(language);
        if (books.isEmpty()) {
            System.out.println("No hay libros registrados en este idioma.");
        } else {
            books.forEach(System.out::println);
        }
    }
}


