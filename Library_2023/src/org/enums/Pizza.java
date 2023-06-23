package org.enums;

public enum Pizza {

    MARGARITTA("Margaritta"),
    QUATTRO_FORMAGGI("Quattro Formaggi"),
    CHICKEN("Chicken"),
    PEPERONI("Peperoni");

    private String name;

    Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
