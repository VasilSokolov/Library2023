package org;

import org.controller.AnimalController;

public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to the Library!");
        Main libraryCSV = new Main();
        libraryCSV.libraryCSVSystem();
    }

    private void libraryCSVSystem(){
        //JF
        AnimalController animalController = new AnimalController();
        animalController.save();
    }

}
