package com.perscholas.cafe;

public class Cappuccino extends Product{

    // fields
    boolean peppermint;
    boolean whippedCream;

    // constructors
    public Cappuccino() {
        this.peppermint = false;
        this.whippedCream = false;
    }

    public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
        super(name, price, description);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    // methods
    @Override
    public double calculateProductTotal() {
        double total = this.getPrice() * this.getQuantity();
        if(this.peppermint) total += 2;
        if(this.whippedCream) total++;
        return total;
    }

    // getters/setters

    public boolean isPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }
}
