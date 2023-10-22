package org.utils;

import org.repository.AuthorRepository;

import java.io.*;

import java.util.*;

public class FileIO {

    public static final String CSV_SEPARATOR = ";";

    private static String pathName;

    public static void writeInCSVFile(String mappedDataToString, String header) {

        //        boolean exist = file.exists();

        File file = new File(pathName);
        boolean exist = fileIsExist(pathName);

        try {
            BufferedWriter csvWriter;
            if (exist) {
                FileWriter fr = new FileWriter(file, true);
                csvWriter = new BufferedWriter(fr);
            } else {
                csvWriter = new BufferedWriter(new FileWriter(file));
                csvWriter.write(header);
            }

            if (mappedDataToString != null) {
                csvWriter.newLine();
                csvWriter.write(mappedDataToString);
                csvWriter.flush();
                csvWriter.close();
            }

        } catch (IOException ex) {
            System.out.printf("Cannot write file: %s, ", file.getName() + ex);
        }

    }

    public static boolean fileIsExist(String fileName) {
        File file = new File(fileName);
        boolean exist = file.exists();
        return exist;
    }

    public static String createHeader(List<String> headers) {
        StringBuilder sb = new StringBuilder();
        for (String header : headers) {
            sb.append(header).append(CSV_SEPARATOR);
        }

        return sb.toString();
    }

//    public static Map<String, Integer> getByElement() {
//        Map<String, Integer> element = new LinkedHashMap<>();
//        int value = 0;
//        for (String header : AuthorRepository.headers) {
//
//            element.put(header, value);
//            value++;
//        }
//        return element;
//    }

    public static String[] readFromCSVFile(String search, int element) {
        String row;
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(pathName));

            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(CSV_SEPARATOR);
                if (search.equals(data[element])) {
                    return data;
                }
            }

        } catch (IOException ex) {
            System.out.println("IOException - addDataInList"); // need to be change
        }

        return null;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static String getPathName() {
        return pathName;
    }

    public static void setPathName(String name) {
        pathName = name;
    }

    public static void printData(String element, Map<String, String> data) {
        data.entrySet()
                .forEach(entry ->  System.out.printf(element + " with %s: %s is not found!%n", entry.getKey(), entry.getValue()));
    }

}
