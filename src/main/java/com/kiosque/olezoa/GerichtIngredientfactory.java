package com.kiosque.olezoa;

/*
Diese Klasse wurde für alle Inhaltsstoffe angelegt, die mit dem Gericht
in Zusammenhang stehen.
 */
public class GerichtIngredientfactory implements Iingredientfactory {

    Gericht gericht;

    public Mayonnaise createMayonnaise() {
        gericht = new Gericht() {
            @Override
            public double cost() {
                return  1500 ;
            }

            @Override
            public String getDescription() {
                return super.getDescription() + "test";
            }
        };
        return new Mayonnaise(gericht);
    }

    public  Mayonnaise createMayonnaise(Gericht gericht){

        return new Mayonnaise(gericht);

    }

    public Sardine createSardine() {
        return new Sardine(gericht);
    }

    public Schinken createSchinken() {
        return new Schinken(gericht);
    }

    public Wurst createWurst() {
        return new Wurst(gericht);
    }
}
