package com.perscholas.cafe;

public class Espresso extends Product{

    // fields
    boolean extraShot;
    boolean macchiato;

    // constructors

    public Espresso() {
        this.extraShot = false;
        this.macchiato = false;
    }

    public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
        super(name, price, description);
        this.extraShot = extraShot;
        this.macchiato = macchiato;
    }

    // methods
        @Override
    public double calculateProductTotal() {
        double total = this.getPrice() * this.getQuantity();
        if(this.extraShot) total += 2;
        if(this.macchiato) total++;
        return total;
    }

    // getters/setters

    public boolean isExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean isMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }
}
