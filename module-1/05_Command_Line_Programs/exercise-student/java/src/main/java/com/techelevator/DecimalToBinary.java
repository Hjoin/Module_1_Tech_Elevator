package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner userValue = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String decimalValues = userValue.nextLine();
		String[] decimalValuesArray = decimalValues.split(" ");

		for (int i = 0; i < decimalValuesArray.length; i++) {
			int binaryNumberNeeded = Integer.parseInt(decimalValuesArray[i]);
			String binaryNumberReceived = Integer.toBinaryString(binaryNumberNeeded);
			System.out.println(binaryNumberNeeded + " in binary is " + binaryNumberReceived);
		}

	}

}
