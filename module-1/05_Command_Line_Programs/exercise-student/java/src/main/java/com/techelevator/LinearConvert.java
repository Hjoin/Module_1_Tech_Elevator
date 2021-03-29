package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner userValue = new Scanner(System.in);

		System.out.print("Please enter a length: ");
		int length = userValue.nextInt();
		userValue.nextLine();

		System.out.print("Is the measurement in (m)eters, or (f)eet? ");

		String isFeetMeters = userValue.nextLine();

		int finalLength = 0;

		if (isFeetMeters.equals("m")) {
			finalLength = (int)(length * 3.2808399);
			System.out.println(length + "m is " + finalLength + "f.");
		} else {
			finalLength = (int)(length * 0.3048);
			System.out.println(length + "f is " + finalLength + "m.");
		}



	}

}
