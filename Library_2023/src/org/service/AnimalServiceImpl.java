package org.service;

import org.model.Animal;
import org.repository.AnimalRepository;

public class AnimalServiceImpl implements AnimalService {

//    @Autowire
    private AnimalRepository animalRepository = new AnimalRepository();


    @Override
    public void save(Animal animal) {
        animalRepository.save(animal);
    }
}
