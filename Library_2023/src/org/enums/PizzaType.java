package org.enums;

public enum PizzaType {

    MARGARITTA("Margaritta"),
    QUATTRO_FORMAGGI("Quattro Formaggi"),
    CHICKEN("Chicken"),
    PEPERONI("Peperoni");

    private String name;

    PizzaType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
