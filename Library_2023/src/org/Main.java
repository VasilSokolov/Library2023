package org;

import org.controller.AnimalController;
import org.utils.JavaSwingEnvironmentDemo;

public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to the Library!");
        JavaSwingEnvironmentDemo  start = new JavaSwingEnvironmentDemo();
        start.pizzaMenu();
//        Main libraryCSV = new Main();
//        libraryCSV.libraryCSVSystem();
    }

    private void libraryCSVSystem(){
        //JF
        functionalityByAnimal();

    }

    private void functionalityByAnimal() {
        AnimalController animalController = new AnimalController();
        animalController.save();

    }

}
