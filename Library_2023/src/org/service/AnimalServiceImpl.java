package org.service;

import org.repository.AnimalRepository;

public class AnimalServiceImpl implements AnimalService {

    private AnimalRepository animalRepository = new AnimalRepository();


    @Override
    public void save() {
        animalRepository.save();
    }
}
