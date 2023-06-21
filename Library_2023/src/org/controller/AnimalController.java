package org.controller;

import org.service.AnimalService;

public class AnimalController {

    private AnimalService animalService;

    public void save() {
        animalService.save();

    }
}
