package com.perscholas.cafe;
import java.util.Scanner;

public class Coffee extends Product {
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

    @Override
    public void addOptions() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many coffees would you like?");
        this.setQuantity(scan.nextInt());
        scan.nextLine();
        System.out.println("Would you like milk with your coffee?");
        if(scan.nextLine().equalsIgnoreCase("YES")) {
            System.out.println("Ok great!");
            this.milk = true;
        } else {
            System.out.println("Alright, no problem.");
        }
        System.out.println("How about sugar with your coffee?");
        if(scan.nextLine().equalsIgnoreCase("YES")) {
            System.out.println("Excellent choice.");
            this.sugar = true;
        } else {
            System.out.println("Ok, no problem.");
        }
    }

    @Override
    public void printOptions() {
        if(this.milk && this.sugar) {
            System.out.printf("Thank you. Your %d %s with milk and sugar will cost $%.2f.\n", this.getQuantity(), this.getName(), this.calculateProductTotal());
        }
        else if(this.milk) {
            System.out.printf("Thank you. Your %d %s with milk will cost $%.2f.\n", this.getQuantity(), this.getName(), this.calculateProductTotal());
        }
        else if(this.sugar) {
            System.out.printf("Thank you. Your %d %s with sugar will cost $%.2f.\n", this.getQuantity(), this.getName(), this.calculateProductTotal());
        } else { System.out.printf("Thank you. Your %d %s will cost $%.2f.\n", this.getQuantity(), this.getName(), this.calculateProductTotal()); }
        System.out.println();
        System.out.printf("Drink name: %s\nPrice: $%.2f\nDescription %s\nQuantity: %d\nWith milk? %b\nWith sugar? %b\n", this.getName(), this.getPrice(), this.getDescription(), this.getQuantity(), this.isMilk(), this.isSugar());
        System.out.println();
    }

    // getters/setters
    public boolean isSugar() { return sugar; }

    public void setSugar(boolean sugar) { this.sugar = sugar; }

    public boolean isMilk() { return milk; }

    public void setMilk(boolean milk) { this.milk = milk; }
}
