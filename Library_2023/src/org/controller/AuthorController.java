package org.controller;

import org.model.Author;
import org.service.AuthorService;
import org.service.AuthorServiceImpl;

import java.util.List;


public class AuthorController {

    private AuthorService authorService = new AuthorServiceImpl();

    public void create(Author author) {
        authorService.create(author);
    }

    public void get(Long authorId){
        authorService.get(authorId);
    }

    public void update(Author author) {

    }

    public void delete(Author author) {

    }
}
