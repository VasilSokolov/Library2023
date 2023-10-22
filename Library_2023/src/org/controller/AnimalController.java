package org.controller;

import org.model.Animal;
import org.service.AnimalService;
import org.service.AnimalServiceImpl;

public class AnimalController {

    private AnimalService animalService = new AnimalServiceImpl();

    public void save(Animal animal) {
        animalService.save(animal);
    }
}
