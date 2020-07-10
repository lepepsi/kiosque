package com.kiosque.olezoa;

public class Mayonnaise extends GerichtIngredientDecorator {

    Gericht gericht;

    public Mayonnaise(Gericht gericht) {
        this.gericht = gericht;
    }

    public String getDescription() {
        return gericht.getDescription() + ", with Mayonnaise";
    }

    public double cost() {
        return gericht.cost() + 50;
    }
}
