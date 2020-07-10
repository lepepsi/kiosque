package com.kiosque.olezoa;

public class Sardine extends GerichtIngredientDecorator {

    Gericht gericht;

    public Sardine(Gericht gericht) {
        this.gericht = gericht;
    }

    public String getDescription() {
        return gericht.getDescription() + ", Sardine";
    }

    public double cost() {
        return gericht.cost() + 50;
    }
}
