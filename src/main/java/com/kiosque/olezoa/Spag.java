package com.kiosque.olezoa;

public class Spag extends  GerichtIngredientDecorator{

    Gericht gericht;

    public Spag(Gericht gericht) {
        this.gericht = gericht;
    }

    public String getDescription() {
        return gericht.getDescription() + ", with Spag";
    }

    public double cost() {
        return gericht.cost() + 100;
    }
}
