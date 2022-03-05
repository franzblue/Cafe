package com.perscholas.cafe;
import java.util.Scanner;

public class Espresso extends Product {
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

    @Override
    public void addOptions() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many espressos would you like?");
        this.setQuantity(scan.nextInt());
        scan.nextLine();
        System.out.println("Would you like an extra shot of espresso?");
        if(scan.nextLine().equalsIgnoreCase("YES")) {
            System.out.println("Ok great!");
            this.extraShot = true;
        } else {
            System.out.println("Ok no problem.");
        }
        System.out.println("Do you want it macchiato style?");
        if(scan.nextLine().equalsIgnoreCase("YES")) {
            System.out.println("Excellent choice.");
            this.macchiato = true;
        } else {
            System.out.println("Ok no problem.");
        }
    }

    @Override
    public void printOptions() {
        if(this.extraShot && this.macchiato) {
            System.out.printf("Thank you. Your %d %s with an extra shot, macchiato style will cost $%.2f.\n", this.getQuantity(), this.getName(), this.calculateProductTotal());
        }
        else if(this.extraShot) {
            System.out.printf("Thank you. Your %d %s with an extra shot will cost $%.2f.\n", this.getQuantity(), this.getName(), this.calculateProductTotal());
        }
        else if(this.macchiato) {
            System.out.printf("Thank you. Your %d %s macchiato style will cost $%.2f.\n", this.getQuantity(), this.getName(), this.calculateProductTotal());
        } else { System.out.printf("Thank you. Your %d %s will cost $%.2f.\n", this.getQuantity(), this.getName(), this.calculateProductTotal()); }
        System.out.println();
        System.out.printf("Drink name: %s\nPrice: $%.2f\nDescription %s\nQuantity: %d\nExtra shot? %b\nMacchiato style? %b\n", this.getName(), this.getPrice(), this.getDescription(), this.getQuantity(), this.isExtraShot(), this.isMacchiato());
        System.out.println();
    }

    // getters/setters
    public boolean isExtraShot() { return extraShot; }

    public void setExtraShot(boolean extraShot) { this.extraShot = extraShot; }

    public boolean isMacchiato() { return macchiato; }

    public void setMacchiato(boolean macchiato) { this.macchiato = macchiato; }
}
