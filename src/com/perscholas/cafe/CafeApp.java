package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

    public static void main() {
        Product coffee = new Product("coffee",2.50,"Hot coffee");
        Product espresso = new Product("espresso", .99, "Double shot");
        Product cappuccino = new Product("cappuccino", 4.20, "Extra froth");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many coffees would you like?");
        int coffeeResponse = scan.nextInt();
        coffee.setQuantity(coffeeResponse);
        System.out.printf("Thank you. Your %d %s will cost $%.2f.\n", coffee.getQuantity(), coffee.getName(), coffee.calculateProductTotal());

        System.out.println("How many espressos would you like?");
        int espressoResponse = scan.nextInt();
        espresso.setQuantity(espressoResponse);
        System.out.printf("Thank you. Your %d %s will cost $%.2f.\n", espresso.getQuantity(), espresso.getName(), espresso.calculateProductTotal());


        System.out.println("How many cappuccinos would you like?");
        int cappuccinoResponse = scan.nextInt();
        cappuccino.setQuantity(cappuccinoResponse);
        System.out.printf("Thank you. Your %d %s will cost $%.2f.\n", cappuccino.getQuantity(), cappuccino.getName(), cappuccino.calculateProductTotal());


        System.out.printf("Your total order comes to $%.2f.", (coffee.calculateProductTotal()+espresso.calculateProductTotal()+cappuccino.calculateProductTotal()));

    }


}
