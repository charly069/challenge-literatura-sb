package com.alura.literalura.principal;

import com.alura.literalura.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MainMenu {

    @Autowired
    private BookService bookService;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Buscar libro por título");
            System.out.println("2. Listar libros por autor");
            System.out.println("3. Listar autores registrados");
            System.out.println("4. Listar autores vivos en un año determinado");
            System.out.println("5. Listar libros por idioma");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Ingrese el título del libro: ");
                    String title = scanner.nextLine();
                    bookService.searchAndSaveBookByTitle(title);
                    break;
                case "2":
                    System.out.print("Ingrese el nombre del autor: ");
                    String author = scanner.nextLine();
                    bookService.listBooksByAuthor(author);
                    break;
                case "3":
                    bookService.listAllAuthors();
                    break;
                case "4":
                    System.out.print("Ingrese el año: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    bookService.listLivingAuthorsByYear(year);
                    break;
                case "5":
                    System.out.print("Ingrese el idioma: ");
                    String language = scanner.nextLine();
                    bookService.listBooksByLanguage(language);
                    break;
                case "6":
                    System.out.println("Saliendo de la aplicación.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}