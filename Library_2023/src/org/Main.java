package org;

import org.controller.AnimalController;
import org.controller.AuthorController;
import org.enums.Country;
import org.model.Animal;
import org.model.Author;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    AuthorController authorController = new AuthorController();

    public static void main(String[] args) {
        System.out.println("Welcome to the Library!");
//        JavaSwingEnvironmentDemo  start = new JavaSwingEnvironmentDemo();
//        start.pizzaMenu();
        Main libraryCSV = new Main();
        libraryCSV.libraryCSVSystem();

    }

    private void libraryCSVSystem() {
        //JFrame
//        functionalityByAnimal();
        functionalityByAuthor();

    }

    private void functionalityByAnimal() {
        AnimalController animalController = new AnimalController();
        Animal animal = new Animal();
        animal.setName("Pesho");
        animalController.save(animal);
        animalController.save(animal);

    }

    private void functionalityByAuthor() {

        for (Author author : createMockedAuthors()) {
            authorController.create(author);
        }
        authorController.get(1L);
//        authorController.get(1L); // return author
        // print author

//        authorController.update(author);
//        authorController.delete(author);
//        authorController.update(author);
    }

    private Author createMockedAuthor(String name, Enum country, LocalDateTime createdOn) {

        Author author = new Author(name, createdOn);
//        author.setId(1L);
//        author.setName(name);
        author.setCountry(country.toString());
//        author.setCreatedOn(createdOn);
//        author.setUpdatedOn();
//        author.setDeleted();

        return author;
    }

    private List<Author> createMockedAuthors() {
        Author author = createMockedAuthor("Ivan Vazov", Country.BULGARIA, LocalDateTime.now());
        Author author2 = createMockedAuthor("Hristo Botev", Country.BULGARIA, LocalDateTime.now());
        Author author3 = createMockedAuthor("Peyo Yavorov", Country.BULGARIA, LocalDateTime.now());
        Author author4 = createMockedAuthor("BBBBBBBBBBBB", Country.BULGARIA, LocalDateTime.now());
        Author author5 = createMockedAuthor("CCCCCCCCCCC", Country.BULGARIA, LocalDateTime.now());

        return new ArrayList<>(Arrays.asList(author, author2, author3, author4, author5));
    }

}
