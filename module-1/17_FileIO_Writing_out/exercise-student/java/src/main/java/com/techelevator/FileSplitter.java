package com.techelevator;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {

		try (Scanner userInput = new Scanner(System.in)) {
			System.out.print("Which file do you want to split? ");
			String filePath = userInput.nextLine();

			try {
				File fileToRead = getFileAtPath(filePath);

				System.out.print("How many lines do you want in each split file? ");
				int linesPerFile = 0;
				boolean isValidValue = false;

				FileReader input = new FileReader(filePath);
				LineNumberReader count = new LineNumberReader(input);
				int lines = (int)count.lines().count();
				count.close();

				while (!isValidValue) {
					try {
						linesPerFile = userInput.nextInt();
						if (linesPerFile > 0) {
							System.out.println("The input file has " + lines + " lines of text.");
							isValidValue = true;
						}
					} catch (InputMismatchException e) {
						System.out.println("That was not a valid number. Try again.");
					} finally {
						userInput.nextLine();
					}
				}

				// At this point we have the file to read and how many lines should be in the split files
				try (Scanner fileInput = new Scanner(fileToRead)) {
					int fileCount = 1;
					while (fileInput.hasNextLine()) {
						String splitFileName = getNextFileName(fileToRead, fileCount);
						File outputFile = new File(fileToRead.getParentFile(), splitFileName);
						try (PrintWriter fileOutput = new PrintWriter(outputFile)) {
							for (int i = 0; i < linesPerFile; i++) {
								if (fileInput.hasNextLine()) {
									fileOutput.println(fileInput.nextLine());
								} else {
									break;
								}
							}
						}

						fileCount++;
					}
				}

			} catch (IOException e) {
				System.out.println("The program has encountered an error.");
				System.exit(1);
			}
		}
	}

	private static File getFileAtPath(String filePath) throws IOException {
		File ourFile = new File(filePath);

		if (!ourFile.exists()) {
			throw new FileNotFoundException("There was no file at " + filePath);
		}

		if (!ourFile.isFile()) {
			throw new IOException(filePath + " is not a file.");
		}

		return ourFile;
	}

	private static String getNextFileName(File inputFile, int count) {
		String fileName = inputFile.getName();
		String extension = fileName.substring(fileName.lastIndexOf('.'));
		String nameWithNoExtension = fileName.substring(0, fileName.lastIndexOf('.'));

		return nameWithNoExtension + "-" + count + extension;
	}

}


