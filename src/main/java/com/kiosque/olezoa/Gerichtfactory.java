package com.kiosque.olezoa;

public class Gerichtfactory implements IgerichtFactory {


    public Omelette createOmelette() {
        return new Omelette();
    }

    public Reis createReis() {
        return new Reis();
    }

    public Avokadopuree createAvokadopuree() {
        return new Avokadopuree();
    }
}
