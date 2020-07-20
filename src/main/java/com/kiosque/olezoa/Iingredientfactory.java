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

    public Wurst createBohne();

    public Wurst createBohne(Gericht gericht);

    public Wurst createSpag();

    public Wurst createSpag(Gericht gericht);

}
