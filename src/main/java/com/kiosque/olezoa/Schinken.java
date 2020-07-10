package com.kiosque.olezoa;

public class Schinken extends GerichtIngredientDecorator {

    Gericht gericht;

    public Schinken(Gericht gericht) {
        this.gericht = gericht;
    }

    public String getDescription() {
        return gericht.getDescription() + ", with Schinken";
    }

    public double cost() {
        return gericht.cost() + 100;
    }
}
