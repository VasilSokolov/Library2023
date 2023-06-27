package org.service;

import org.repository.AnimalRepository;

public class AnimalServiceImpl implements AnimalService {

//    @Autowire
    private AnimalRepository animalRepository = new AnimalRepository();


    @Override
    public void save() {




        animalRepository.save();
    }
}
