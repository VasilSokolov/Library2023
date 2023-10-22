package org.utils.test;

public class Cat extends AnimalTest {

    public Cat() {
    }

    public Cat(Long id, String name) {
        super(id, name);
    }

    @Override
    public String animalDo(String animalDo) {
        return super.animalDo(animalDo);
    }
}
