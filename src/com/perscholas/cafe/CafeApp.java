package com.perscholas.cafe;
import java.util.Scanner;

public class CafeApp {

    public static void main() {
        // objects
        Coffee coffee = new Coffee("Coffee",2.50,"Hot coffee", false, false);
        Espresso espresso = new Espresso("Espresso", .99, "Double shot", false, false);
        Cappuccino cappuccino = new Cappuccino("Cappuccino", 4.20, "Extra froth", false, false);

        Scanner scan = new Scanner(System.in);

        boolean checkout = false;
        while(!checkout) {
            System.out.println("Make your decision by selecting a number below.");
            System.out.println("1: Coffee\n2: Espresso\n3: Cappuccino\n4: Checkout\n");
            int userInput = scan.nextInt();
            if(userInput == 1) {
                coffee.addOptions();
                coffee.printOptions();
            } else if (userInput == 2) {
                espresso.addOptions();
                espresso.printOptions();
            } else if (userInput == 3) {
                cappuccino.addOptions();
                cappuccino.printOptions();
            } else if (userInput == 4) {
                checkout = true;
                double totalOrdered = (coffee.calculateProductTotal()+espresso.calculateProductTotal()+cappuccino.calculateProductTotal());
                double salesTax = totalOrdered * 00.069;
                double amountDue = totalOrdered + salesTax;
                // total
                System.out.printf("Your total order comes to $%.2f. Add $%.2f in tax, now you owe $%.2f. Thank you!\n", totalOrdered, salesTax, amountDue);
            }
        }
    }
}
