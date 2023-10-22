package org.repository;

import org.model.Author;
import org.service.AuthorServiceImpl;
import org.utils.FileIO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class AuthorRepository {

    public static final List<String> headers = new ArrayList<>(Arrays.asList("ID", "NAME", "COUNTRY", "CREATED_ON", "UPDATED_ON", "DELETED"));

    private long count = 1;

    public void save(Author author) {
        author.setId(count++);
        String mappedAuthorToString = mappedAuthorToString(author);
        String header = FileIO.createHeader(headers);
        FileIO.writeInCSVFile(mappedAuthorToString, header);
    }

    public Author getAuthorById(Long authorId) {

        Map<String, String> printData = new HashMap<>();
        printData.put("id", authorId.toString());

        String[] data = FileIO.readFromCSVFile(authorId.toString(), 0);
        if (data == null) {
            FileIO.printData("Author", printData);
        }
        return getAuthorFromCSV(data);
    }

    private static Author getAuthorFromCSV(String[] data) {

        if (data != null) {
            Author author = new Author();
            author.setId(Long.parseLong(data[0]));
            author.setName(data[1]);
            author.setCountry(data[2]);
            author.setCreatedOn(LocalDateTime.parse(data[3]));
            author.setUpdatedOn(data[4] != null && !data[4].equals("") ? LocalDate.parse(data[4]) : null);
            author.setDeleted(Boolean.parseBoolean(data[5]));
            return author;
        }
        return null;
    }

    private static String mappedAuthorToString(Author author) {

        if (author.getName() == null) {
            throw new IllegalArgumentException("NAME cannot be empty!");
        }

        if (author.getCreatedOn() == null) {
            throw new IllegalArgumentException("CREATED_ON cannot be empty!");
        }

        String separator = FileIO.CSV_SEPARATOR;
        StringBuilder sb = new StringBuilder();
        sb.append(author.getId())
                .append(separator)
                .append(author.getName())
                .append(separator)
                .append(author.getCountry())
                .append(separator)
                .append(author.getCreatedOn())
                .append(separator)
                .append(author.getUpdatedOn() != null ? author.getUpdatedOn() : "")
                .append(separator)
                .append(author.isDeleted())
                .append(separator);

        return sb.toString();
    }
}
