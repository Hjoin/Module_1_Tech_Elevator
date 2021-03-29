package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		try (Scanner userInput = new Scanner(System.in)) {
			System.out.print("Destination for FizzBuzz.txt? ");
			String filePath = userInput.nextLine();

			writeFileFizzBuzz(filePath);
		}

	}

	private static void writeFileFizzBuzz(String filePath) {
		File fizzBuzzFile = new File(filePath);

		try (PrintWriter fileOutput = new PrintWriter(fizzBuzzFile)) {
			for (int i = 1; i <= 300; i++) {
				if (i % 5 == 0 &&
						i % 3 == 0) {
					fileOutput.println("FizzBuzz");
				} else if (contains3(i)) {
					fileOutput.println("Fizz");
				}else if (i % 5 == 0) {
					fileOutput.println("Buzz");
				} else if (i % 3 == 0) {
					fileOutput.println("Fizz");
				}  else if (contains5(i)) {
					fileOutput.println("Buzz");
				} else {
						fileOutput.println(i);
					}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}

	private static boolean contains5(int number) {
		String numberAsString = Integer.toString(number);

		return numberAsString.contains("5");
	}

	private static boolean contains3(int number) {
		String numberAsString = Integer.toString(number);

		return numberAsString.contains("3");
	}

}


