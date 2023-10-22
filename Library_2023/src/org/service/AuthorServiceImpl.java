package org.service;

import org.model.Author;
import org.repository.AuthorRepository;
import org.utils.FileIO;


public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository = new AuthorRepository();

    private static final String pathName = "D:\\Zlatka_Gluhova\\IT\\Projects\\Library2023\\Library_2023\\resources\\db\\author.csv";



    @Override
    public void create(Author author) {
        // proverki tuk

        if (!verifyForDuplication(author)) {
            FileIO.setPathName(pathName);
            authorRepository.save(author);
        }
    }

    private boolean verifyForDuplication(Author author) {
        FileIO.setPathName(pathName);
        return !(FileIO.readFromCSVFile(author.getName(), 1) == null);
    }



    @Override
    public void get(Long authorId) {
        FileIO.setPathName(pathName);
        authorRepository.getAuthorById(authorId);
    }
}
