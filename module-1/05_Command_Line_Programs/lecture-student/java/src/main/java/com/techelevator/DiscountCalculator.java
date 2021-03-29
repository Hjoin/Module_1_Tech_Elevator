package com.techelevator;

import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator!");
        boolean finished = false;
        while(!finished) {

            //Prompt user to enter price
            System.out.print("Please enter a list of price, separated by spaces: ");
            String valueOfGoods = input.nextLine();
            String[] priceArray = valueOfGoods.split(" ");

            //Calculate the Total Price
            double total = 0;
            for (int i = 0; i < priceArray.length; i++) {
                double undiscountedPrice = Double.parseDouble(priceArray[i]);
                total += undiscountedPrice;
            }

            //Prompt user to enter discount percentage

            System.out.print("Please enter a discount percentage (20 for a 20% discount, for example): ");
            String discount = input.nextLine();
            int percentageDiscount = Integer.parseInt(discount);

            //Calculate the discounted price
            double discountAmount = total * (percentageDiscount / 100.0);
            double discountedTotal = total - discountAmount;

            //Print out the discounted price
            System.out.format("The total price is: $%.2f\n", total);

            System.out.format("The discounted total is $%.2f\n", discountedTotal);

            System.out.print("Are you finished (yes/no)? ");
            String response = input.nextLine();
            if (response.equals("yes")) {
                finished = true;
            }
        }
        System.out.println("Thank you for using the Discount Calculator.");
    }
}
