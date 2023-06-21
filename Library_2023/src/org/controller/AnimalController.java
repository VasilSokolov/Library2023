package org.controller;

import org.service.AnimalService;
import org.service.AnimalServiceImpl;

public class AnimalController {

    private AnimalService animalService = new AnimalServiceImpl();

    public void save() {
        animalService.save();
    }
}
