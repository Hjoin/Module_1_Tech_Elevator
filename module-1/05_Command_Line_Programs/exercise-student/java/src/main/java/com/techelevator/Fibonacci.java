package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner userValue = new Scanner(System.in);
		System.out.print("Please enter the Fibonacci number: ");
		int fibonnaciNumber = userValue.nextInt();

		if(fibonnaciNumber > 1) {
			System.out.print("0 1 1 ");
			int fibonnaciTwo = 1;
			int fibonnaciOne = 1;
			for (int i = 1; fibonnaciNumber > i + fibonnaciTwo;){
				fibonnaciOne = i + fibonnaciTwo;
				i = fibonnaciTwo;
				fibonnaciTwo = fibonnaciOne;
				System.out.print(fibonnaciOne + " ");
			}
		}

	}

}
