package com.kiosque.olezoa;

/*
Für alle unsere Bestandteile haben wir eine Schnittstelle
 */
public interface Iingredientfactory {


    public Mayonnaise createMayonnaise();

    public Mayonnaise createMayonnaise(Gericht gericht);

    public Sardine createSardine();

    public Sardine createSardine(Gericht gericht);

    public Schinken createSchinken();

    public Schinken createSchinken(Gericht gericht);

    public Wurst createWurst();

    public Wurst createWurst(Gericht gericht);

    public Bohne createBohne();

    public Bohne createBohne(Gericht gericht);

    public Spag createSpag();

    public Spag createSpag(Gericht gericht);

}
