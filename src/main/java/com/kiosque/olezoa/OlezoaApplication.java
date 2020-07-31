package com.kiosque.olezoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OlezoaApplication {


    public static void main(String[] args) {
        SpringApplication.run(OlezoaApplication.class, args);

        GerichtIngredientfactory gerichtIngredientfactory = new GerichtIngredientfactory();

        gerichtIngredientfactory.createMayonnaise();
        gerichtIngredientfactory.createSardine();

        gerichtIngredientfactory.createSardine();

   /*     Mayonnaise avokadopuree1 = new Mayonnaise(new Avokadopuree(gerichtIngredientfactory));

        Mayonnaise avokadopuree2 = new Mayonnaise(new Sardine(new Avokadopuree(gerichtIngredientfactory)));
*/

        Omelette omelette = new Omelette();

        GerichtIngredientfactory gerichtIngredientfactory1 = new GerichtIngredientfactory();

        Mayonnaise mayonnaise1 = gerichtIngredientfactory1.createMayonnaise(omelette);

        Sardine sardine1 = gerichtIngredientfactory1.createSardine(mayonnaise1);

        gerichtIngredientfactory1.createSchinken();

        gerichtIngredientfactory1.createWurst();


        gerichtIngredientfactory.createMayonnaise();

        //System.out.println(sardine1.getDescription());

        Gericht gericht = new Omelette();


        //avokadopuree.description.equals(Gericht.gerichtName.Avokadopuree);

        GerichtIngredientfactory gerichtIngredientfactory2 = new GerichtIngredientfactory();

        //gerichtIngredientfactory2.createMayonnaise(gerichtIngredientfactory1.createSardine());

        //System.out.println(gerichtIngredientfactory2.createMayonnaise(gerichtIngredientfactory1.createSardine()));

		/*gericht = gerichtIngredientfactory2.createWurst(gericht);
		gericht = gerichtIngredientfactory2.createSardine(gericht);
		gericht = gerichtIngredientfactory2.createSchinken(gericht);*/

        // System.out.println(gericht.getDescription());

        List<String> listOfCondiments = new ArrayList<>();

        listOfCondiments.add("Wurst");
        listOfCondiments.add("Mayonnaise");
        listOfCondiments.add("Spag");

        //  System.out.println(findPreisofeineBestellung("Omelette",listOfCondiments));


        GerichtBuilder gerichtBuilder = new GerichtBuilder();

        System.out.println(gerichtBuilder.makeGerichtwithCondiments("Omelette", listOfCondiments).getDescription());


    }


}
