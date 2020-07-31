package com.kiosque.olezoa;

import java.util.List;

public class GerichtBuilder {

    Gericht gericht;

    public Gericht makeGerichtwithCondiments(String gerichtname, List<String> listOfCondiment) {


        Gerichtfactory gerichtfactory = new Gerichtfactory();


        if (gerichtname.equals(Gericht.gerichtName.Avokadopuree.name())) {
            gericht = gerichtfactory.createAvokadopuree();
        }
        if (gerichtname.equals(Gericht.gerichtName.Omelette.name())) {
            gericht = gerichtfactory.createOmelette();
        }
        if (gerichtname.equals(Gericht.gerichtName.Reis.name())) {
            gericht = gerichtfactory.createReis();
        }

        if (listOfCondiment != null) {
            for (String condiment : listOfCondiment) {

                GerichtIngredientfactory gerichtIngredientfactory = new GerichtIngredientfactory();

                if (condiment.equals(GerichtIngredientDecorator.GerichtIngreditenName.Wurst.name())) {
                    gericht = gerichtIngredientfactory.createWurst(gericht);
                }
                if (condiment.equals(GerichtIngredientDecorator.GerichtIngreditenName.Mayonnaise.name())) {
                    gericht = gerichtIngredientfactory.createMayonnaise(gericht);
                }
                if (condiment.equals(GerichtIngredientDecorator.GerichtIngreditenName.Sardine.name())) {
                    gericht = gerichtIngredientfactory.createSardine(gericht);
                }
                if (condiment.equals(GerichtIngredientDecorator.GerichtIngreditenName.Schinken.name())) {
                    gericht = gerichtIngredientfactory.createSchinken(gericht);
                }
                if (condiment.equals(GerichtIngredientDecorator.GerichtIngreditenName.Spag.name())) {
                    gericht = gerichtIngredientfactory.createSpag(gericht);
                }
            }
        }
        return gericht;
    }
}
