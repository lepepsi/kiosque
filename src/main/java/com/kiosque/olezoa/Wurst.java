package com.kiosque.olezoa;

public class Wurst extends GerichtIngredientDecorator {

    Gericht gericht;

    public Wurst(Gericht gericht) {
        this.gericht = gericht;
    }

    public String getDescription() {
        return gericht.getDescription() + ", Wurst";
    }

    public double cost() {
        return gericht.cost() + 100;
    }
}
