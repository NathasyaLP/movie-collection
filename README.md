# Movie Collection
A simple CRUD (Create, Read, Update, Delete) application for managing a movie collection, built using Java, Spring Boot, and MySQL.
# Features
- Create, view, update, and delete movie entries
- Search for movies by title
- Stores movie details such as title, director, summary, and genres
- Uses a MySQL database to persist movie data
# Getting Started
## Prerequisites
- Java 17 or higher
- MySQL server
## Installation
1. Clone the repository
```language
git clone https://github.com/NathasyaLP/movie-collection.git
```
2. Update the MySQL connection details in the `application.properties` file:
```language
spring.datasource.url=jdbc:mysql://localhost:3306/movie_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```
3. Build the project using Maven
4. Run the application
5. Access the application at `http://localhost:8080/movies`
## Usage
- To view the list of movies, go to the `/movies` endpoint.
- To create a new movie, use the `/movies/create` endpoint and provide the required details.
- To edit a movie, use the `/movies/edit/{id}` endpoint, where {id} is the ID of the movie.
- To update a movie, use the `/movies/update/{id}` endpoint, where {id} is the ID of the movie.
- To delete a movie, use the `/movies/delete/{id}` endpoint, where {id} is the ID of the movie.
- To search for movies by title, use the `/movies/search?title=<keyword>` endpoint.
## Screenshot
- Movies List
  ![Movies List Page](https://drive.google.com/uc?export=view&id=1kVRbpx__k6HTjd_5yc4jf4p4cdCuVhaH)
- Create Movie Form
  ![Create Movie Form](https://drive.google.com/uc?export=view&id=1AvleoY8q3IxJsQBGpe4wOOXN_GZXXFH6)
- Update and Delete Movie Form
  ![Update and Delete Movie Form](https://drive.google.com/uc?export=view&id=1kkl_9d5lqGcYpVWdxmWqfbxs3ahNjoXj)
- Search Functionality
  ![Search Functionality](https://drive.google.com/uc?export=view&id=1-eb62Irs8K8En8OB2UbxyWybV8fa0doG)
## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Thymeleaf (for the view layer)
- Bootstrap (for styling)
## Contributing
If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.
