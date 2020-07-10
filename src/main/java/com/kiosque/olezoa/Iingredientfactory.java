package com.kiosque.olezoa;

import org.springframework.beans.factory.annotation.Autowired;

/*
Für alle unsere Bestandteile haben wir eine Schnittstelle
 */
public interface Iingredientfactory {


    public Mayonnaise createMayonnaise();

    public Mayonnaise createMayonnaise(Gericht gericht);

    public Sardine createSardine();

    public Schinken createSchinken();

    public Wurst createWurst();
}
