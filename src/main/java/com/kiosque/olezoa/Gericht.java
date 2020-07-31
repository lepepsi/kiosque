package com.kiosque.olezoa;

/*
Wir erstellen eine abstrakte Klasse für jede unserer verschiedenen Mahlzeiten.
 */
public abstract class Gericht {


    /*
  Jedes Gericht hat eine Beschreibung und einen Preis
   */

    String description = "Unbekanntes Essen ...";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public enum gerichtName {
        Omelette,
        Avokadopuree,
        Reis;
    }


}
