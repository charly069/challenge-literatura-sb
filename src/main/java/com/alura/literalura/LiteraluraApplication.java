package com.alura.literalura;

import com.alura.literalura.principal.MainMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsoleLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsoleLibraryApplication.class, args);
		new MainMenu().start(); // Inicia el menú principal de la aplicación
	}
}

