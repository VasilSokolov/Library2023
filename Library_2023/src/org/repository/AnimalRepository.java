package org.repository;

import org.model.Animal;
import org.utils.FileIO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalRepository {

    public static final List<String> headers = new ArrayList<>(Arrays.asList("ID", "NAME"));
    private final String pathName = "D:\\Zlatka_Gluhova\\IT\\Projects\\Library2023\\Library_2023\\resources\\db\\animal.csv";

    public void save(Animal animal) {
        //save in csv DB
        System.out.println("Save animal");
        String mappedAnimalToString = mappedAnimalToString(animal);
        String header = FileIO.createHeader(headers);
        FileIO.writeInCSVFile(mappedAnimalToString, header);
    }

    public Animal getAnimalById(){
        return null;
    }

    private String mappedAnimalToString(Animal animal) {
        StringBuilder sb = new StringBuilder();
        sb.append(animal.getId()).append(FileIO.CSV_SEPARATOR)
                .append(animal.getName()).append(FileIO.CSV_SEPARATOR);

        return sb.toString();
    }
}
