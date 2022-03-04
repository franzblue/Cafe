package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

    public static void main() {
        Coffee coffee = new Coffee("coffee",2.50,"Hot coffee", false, false);
        Espresso espresso = new Espresso("espresso", .99, "Double shot", false, false);
        Cappuccino cappuccino = new Cappuccino("cappuccino", 4.20, "Extra froth", false, false);

        Scanner scan = new Scanner(System.in);
        System.out.println("How many coffees would you like?");
        int coffeeResponse = scan.nextInt();
        coffee.setQuantity(coffeeResponse);
        System.out.println("Would you like milk? Please answer true or false, all in lower case.");
        boolean milkResponse = scan.nextBoolean();
        coffee.setMilk(milkResponse);
        System.out.println("Would you like sugar? Please answer true or false, all in lower case.");
        boolean sugarResponse = scan.nextBoolean();
        coffee.setSugar(sugarResponse);

        // if statement to check milk and sugar
        // should make this a loop or something
        if(coffee.milk && coffee.sugar) {
            System.out.printf("Thank you. Your %d %s with milk and sugar will cost $%.2f.\n", coffee.getQuantity(), coffee.getName(), coffee.calculateProductTotal());
        }
        else if(coffee.milk) {
            System.out.printf("Thank you. Your %d %s with milk will cost $%.2f.\n", coffee.getQuantity(), coffee.getName(), coffee.calculateProductTotal());
        }
        else if(coffee.sugar) {
            System.out.printf("Thank you. Your %d %s with sugar will cost $%.2f.\n", coffee.getQuantity(), coffee.getName(), coffee.calculateProductTotal());
        } else { System.out.printf("Thank you. Your %d %s will cost $%.2f.\n", coffee.getQuantity(), coffee.getName(), coffee.calculateProductTotal()); }


        System.out.println("How many espressos would you like?");
        int espressoResponse = scan.nextInt();
        espresso.setQuantity(espressoResponse);
        System.out.println("Would you like an extra shot? It will cost $2 extra. Please answer true or false, all in lower case.");
        boolean shotResponse = scan.nextBoolean();
        espresso.setExtraShot(shotResponse);
        System.out.println("Would you like macchiato style? It will cost $1 extra. Please answer true or false, all in lower case.");
        boolean macchiatoResponse = scan.nextBoolean();
        espresso.setExtraShot(macchiatoResponse);
        System.out.printf("Thank you. Your %d %s will cost $%.2f.\n", espresso.getQuantity(), espresso.getName(), espresso.calculateProductTotal());


        System.out.println("How many cappuccinos would you like?");
        int cappuccinoResponse = scan.nextInt();
        cappuccino.setQuantity(cappuccinoResponse);
        System.out.println("Would you like an extra shot? It will cost $2 extra. Please answer true or false, all in lower case.");
        boolean peppermintResponse = scan.nextBoolean();
        cappuccino.setPeppermint(peppermintResponse);
        System.out.println("Would you like macchiato style? It will cost $1 extra. Please answer true or false, all in lower case.");
        boolean whippedCreamResponse = scan.nextBoolean();
        cappuccino.setWhippedCream(whippedCreamResponse);
        System.out.printf("Thank you. Your %d %s will cost $%.2f.\n", cappuccino.getQuantity(), cappuccino.getName(), cappuccino.calculateProductTotal());

        double totalOrdered = (coffee.calculateProductTotal()+espresso.calculateProductTotal()+cappuccino.calculateProductTotal());
        double salesTax = totalOrdered * 00.069;
        double amountDue = totalOrdered + salesTax;

        System.out.printf("Your total order comes to $%.2f. Add $%.2f in tax, now you owe $%.2f. Thank you!", totalOrdered, salesTax, amountDue);

    }


}
