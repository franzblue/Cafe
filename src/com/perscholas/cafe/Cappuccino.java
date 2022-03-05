package com.perscholas.cafe;
import java.util.Scanner;

public class Cappuccino extends Product {
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

    @Override
    public void addOptions() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many cappuccinos would you like?");
        this.setQuantity(scan.nextInt());
        scan.nextLine();
        System.out.println("Would you like peppermint flavor?");
        if(scan.nextLine().equalsIgnoreCase("YES")) {
            System.out.println("Ok great!");
            this.peppermint = true;
        } else {
            System.out.println("Ok no problem.");
        }
        System.out.println("Would you like whipped cream on top?");
        if(scan.nextLine().equalsIgnoreCase("YES")) {
            System.out.println("Excellent choice.");
            this.whippedCream = true;
        } else {
            System.out.println("Ok no problem.");
        }
    }

    @Override
    public void printOptions() {
        if(this.peppermint && this.whippedCream) {
            System.out.printf("Thank you. Your %d %s with peppermint and whipped cream will cost $%.2f.\n", this.getQuantity(), this.getName(), this.calculateProductTotal());
        }
        else if(this.peppermint) {
            System.out.printf("Thank you. Your %d %s with peppermint will cost $%.2f.\n", this.getQuantity(), this.getName(), this.calculateProductTotal());
        }
        else if(this.whippedCream) {
            System.out.printf("Thank you. Your %d %s with whipped cream will cost $%.2f.\n", this.getQuantity(), this.getName(), this.calculateProductTotal());
        } else { System.out.printf("Thank you. Your %d %s will cost $%.2f.\n", this.getQuantity(), this.getName(), this.calculateProductTotal()); }
        System.out.println();
        System.out.printf("Drink name: %s\nPrice: $%.2f\nDescription %s\nQuantity: %d\nWith peppermint? %b\nWith whipped cream? %b\n", this.getName(), this.getPrice(), this.getDescription(), this.getQuantity(), this.isWhippedCream(), this.isPeppermint());
        System.out.println();
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
