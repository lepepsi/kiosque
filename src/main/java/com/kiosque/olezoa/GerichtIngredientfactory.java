package com.kiosque.olezoa;

/*
Diese Klasse wurde für alle Inhaltsstoffe angelegt, die mit dem Gericht
in Zusammenhang stehen.
 */
public class GerichtIngredientfactory implements Iingredientfactory {

    Gericht gericht;

    public Mayonnaise createMayonnaise() {
        return new Mayonnaise(gericht);
    }

    public Mayonnaise createMayonnaise(Gericht gericht) {

        return new Mayonnaise(gericht);
    }

    public Sardine createSardine() {

        return new Sardine(gericht);
    }

    public Sardine createSardine(Gericht gericht) {
        return new Sardine(gericht);
    }

    public Schinken createSchinken() {

        return new Schinken(gericht);
    }

    public Schinken createSchinken(Gericht gericht) {

        return new Schinken(gericht);
    }

    public Wurst createWurst() {
        return new Wurst(gericht);
    }

    public Wurst createWurst(Gericht gericht) {

        return new Wurst(gericht);
    }

    public Bohne createBohne() {
        return new Bohne(gericht);
    }

    public Bohne createBohne(Gericht gericht) {
        return new Bohne(gericht);
    }

    public Spag createSpag() {
        return new Spag(gericht);
    }

    public Spag createSpag(Gericht gericht) {
        return new Spag(gericht);
    }


}
