package com.kiosque.olezoa;

/*
 Wir kreieren nach dem Dekorator-Entwurf eine von den Gericht abhängige Klasse für all unsere verschiedenen Zutaten.
 */
public abstract class GerichtIngredientDecorator extends Gericht {

    public abstract String getDescription();

    public enum GerichtIngreditenName {
        Mayonnaise,
        Sardine,
        Schinken,
        Spag,
        Wurst;
    }
}
