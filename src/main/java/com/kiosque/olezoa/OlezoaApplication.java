package com.kiosque.olezoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OlezoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlezoaApplication.class, args);

		GerichtIngredientfactory gerichtIngredientfactory = new GerichtIngredientfactory();
		Avokadopuree avokadopuree = new Avokadopuree(gerichtIngredientfactory);

		gerichtIngredientfactory.createMayonnaise();
		gerichtIngredientfactory.createSardine();

		gerichtIngredientfactory.createSardine();

		Mayonnaise avokadopuree1 = new Mayonnaise(new Avokadopuree(gerichtIngredientfactory));

		Mayonnaise avokadopuree2 = new Mayonnaise(new Sardine(new Avokadopuree(gerichtIngredientfactory)));

		Omelette omelette = new Omelette();




		gerichtIngredientfactory.createMayonnaise();

		System.out.println(gerichtIngredientfactory.createMayonnaise(avokadopuree1).cost());
	}


}
