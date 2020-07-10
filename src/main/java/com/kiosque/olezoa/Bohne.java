package com.kiosque.olezoa;

public class Bohne extends GerichtIngredientDecorator {

    Gericht gericht;

    public Bohne(Gericht gericht) {
        this.gericht = gericht;
    }

    public String getDescription() {
        return gericht.getDescription() + ", with Bohne";
    }

    public double cost() {
        return gericht.cost() + 50;
    }
}
