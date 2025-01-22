Literalura - Aplicación de Consola

Literalura es una aplicación de consola desarrollada en Java utilizando Spring Boot, Maven, PostgreSQL y Spring Data JPA. Esta aplicación permite interactuar con la API de Gutendex para buscar libros, registrar autores y realizar consultas avanzadas sobre la base de datos.

Características

Buscar libro por título: Consulta la API de Gutendex para buscar libros según el título proporcionado y los registra en la base de datos.

Listar libros por autor: Muestra todos los libros registrados de un autor específico.

Listar autores registrados: Proporciona una lista de autores únicos registrados en la base de datos.

Filtrar autores vivos por año: Lista los autores que estaban vivos en un año determinado.

Listar libros por idioma: Permite filtrar los libros registrados según su idioma.

Validaciones: Asegura que no se registren libros duplicados y que las entradas del usuario sean coherentes.

Tecnologías Utilizadas

Java 17

Spring Boot 3

Maven

PostgreSQL

Spring Data JPA

Lombok

RestTemplate

Requisitos Previos

Tener instalado Java 17 o superior.

Tener instalado Maven.

Tener PostgreSQL configurado y ejecutándose.

Crear una base de datos llamada console_library.

Configuración Inicial

Clonar el repositorio:

git clone https://github.com/usuario/literalura.git
cd literalura

Configurar las credenciales de la base de datos en el archivo application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/console_library
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Construir el proyecto:

mvn clean install

Ejecutar la aplicación:

mvn spring-boot:run

Uso

Al iniciar la aplicación, se mostrará un menú interactivo en la consola con las siguientes opciones:

Buscar libro por título: Permite buscar un libro en la API Gutendex introduciendo su título.

Listar libros por autor: Solicita el nombre del autor y muestra los libros registrados de ese autor.

Listar autores registrados: Muestra todos los autores únicos registrados.

Listar autores vivos en un año determinado: Solicita un año y lista los autores que estaban vivos en esa fecha.

Listar libros por idioma: Solicita un idioma y muestra todos los libros registrados en ese idioma.

Salir: Termina la ejecución de la aplicación.

Estructura del Proyecto

com.alura.literalura
├── model
│   └── Book.java           # Entidad que representa los libros
├── repository
│   └── BookRepository.java # Repositorio JPA para la entidad Book
├── service
│   └── BookService.java    # Lógica de negocio para gestionar libros
├── MainMenu.java           # Menú principal de la aplicación
└── ConsoleLibraryApplication.java # Clase principal de arranque

API de Gutendex

La aplicación utiliza la API pública de Gutendex para buscar libros:

URL base: https://gutendex.com/books/?search=

Se espera que los resultados de la API contengan información como:

Título del libro

Nombre del autor

Idioma

Año de publicación

Futuras Mejoras

Añadir paginación para grandes volúmenes de datos.

Mejorar el manejo de errores de conexión con la API.

Implementar más filtros avanzados para búsquedas.

Contribución

Haz un fork del proyecto.

Crea una nueva rama:

git checkout -b feature/nueva-funcionalidad

Realiza tus cambios y haz un commit:

git commit -m "Añadida nueva funcionalidad"

Sube los cambios:

git push origin feature/nueva-funcionalidad

Crea un Pull Request.

Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

¡Gracias por usar Literalura! 😊
