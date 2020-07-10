package com.kiosque.olezoa;

public class Avokadopuree extends Gericht {

    GerichtIngredientfactory gerichtIngredientfactory;

    public Avokadopuree(GerichtIngredientfactory gerichtIngredientfactory) {
        this.gerichtIngredientfactory = gerichtIngredientfactory;
    }

    public String description(){
       // description = "Avokado Puree";
        return description + "Avokado Puree" ;
    }

    public double cost() {
        return 900;
    }

   /* @Override
    public double cost() {
        return gerichtIngredientfactory.createSardine().cost() + 600;
    }*/
}
