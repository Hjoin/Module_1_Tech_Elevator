package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner userValue = new Scanner(System.in);

		System.out.print("Please enter a temperature: ");
		int temperature = userValue.nextInt();
		userValue.nextLine();

		System.out.print("Is the temperature entered in (F)ahrenheit, or (C)elsius? ");

		String isFahrenheitCelsius = userValue.nextLine();

		int finalTemperature = 0;

		if (isFahrenheitCelsius.equals("F")) {
			finalTemperature = (int)((temperature - 32) / 1.8);
			System.out.println(temperature + "F is " + finalTemperature + "C.");
		} else {
			finalTemperature = (int)(temperature * 1.8 + 32);
			System.out.println(temperature + "C is " + finalTemperature + "F.");
		}

	}

}
