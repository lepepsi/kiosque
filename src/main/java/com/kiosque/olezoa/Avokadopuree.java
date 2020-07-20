package com.kiosque.olezoa;

public class Avokadopuree extends Gericht {

    GerichtIngredientfactory gerichtIngredientfactory;

    public Avokadopuree(GerichtIngredientfactory gerichtIngredientfactory) {
        this.gerichtIngredientfactory = gerichtIngredientfactory;
    }

    public double cost() {
        return 900;
    }

    public String getDescription() {
        return "Avokado Puree";
    }

}
