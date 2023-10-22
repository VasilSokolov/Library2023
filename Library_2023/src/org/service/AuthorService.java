package org.service;

import org.model.Author;

public interface AuthorService {

    void create(Author author);

    void get(Long authorId);

}
