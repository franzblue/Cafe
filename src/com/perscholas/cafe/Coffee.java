package com.perscholas.cafe;

public class Coffee extends Product{

    // fields
    boolean sugar;
    boolean milk;

    // constructors

    public Coffee() {
        super();
        this.sugar = false;
        this.milk = false;
    }

    public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
        super(name, price, description);
        this.sugar = sugar;
        this.milk = milk;
    }

    // methods
    @Override
    public double calculateProductTotal() {
        double total = this.getPrice() * this.getQuantity();
        return total;
    }

    // getters/setters

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }
}
