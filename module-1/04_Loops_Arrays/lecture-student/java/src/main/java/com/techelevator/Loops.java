package com.techelevator;

public class Loops {

    public static void main(String[] args) {

        //Count Up
        for (int i = 1; i < 4; i++) {
            System.out.println(i);
        }

        //Count down
        for (int i = 4; i > 0; i--) {
            System.out.println(i);
        }

        //Count by two
        for (int i = 2; i < 10 ; i += 2){
            System.out.print(i + " ");
        }

        //Add up numbers
        int sum = 0;
        for (int i = 1; i < 101; i++){
            sum += i;
        }
        System.out.println(sum);

        //Add up only odd numbers
        int oddSum = 0;
        for (int i = 1; i < 101; i++){
            if (i % 2 == 1){
                oddSum += i;
            }
        }
        System.out.println(oddSum);
    }
}
