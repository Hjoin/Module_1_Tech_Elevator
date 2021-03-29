package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
	 */
	public List<String> array2List(String[] stringArray) {
		List<String> result = new ArrayList<>(); //Creating a new Array
		for (String word : stringArray) { //For each word from the original Array
			result.add(word); //Add the word to the newly created Array
		}
		return result; //Return the newly created Array
	}

	/*
	 Given a list of Strings, return an array containing the same Strings in the same order
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {
		return stringList.toArray(new String[stringList.size()]); //Returning stringList sent to a new Array of matching length and Strings
	}

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	public List<String> no4LetterWords(String[] stringArray) {
		ArrayList<String> backUp = new ArrayList<String>(); //Creating new Array to not tamper with the original
		for (String word : stringArray) { //Going through each word in stringArray
			if(word.length() != 4) { //While going through the loop, checking to see if the word is not equal to 4
				backUp.add(word); //If the word does not have the length of 4, add it to the new Array
			}
		}
		return backUp; //Returning the newly created Array without words that are 4 in length
	}

	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray) {
		List<Double> newValues = new ArrayList<Double>(); //create a new List with Double values declared
		for (Integer number : intArray) { //for loop sorting through each value in intArray
			newValues.add(number / 2.0); //adding each value from intArray only once it has been divided and converted to a double (divide by a double to get that to happen)
		}
		return newValues; //returning the Doubles list of original values divided by 2
	}

	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 64362
	 */
	public Integer findLargest(List<Integer> integerList) {
		return Collections.max(integerList); //using Collections.max() to find the maxValue in the data provided by integerList
	}

	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {
		List<Integer> newValues = new ArrayList<Integer>(); //creating new integer List
		for (Integer number : integerArray) { //going through each value in integerArray
			if (number % 2 == 1) { //if the value is odd (there's a remainder of 1 when divided by 2)
				newValues.add(number); //add number to the new integer List
			}
		}
		return newValues; //return new integer List with odd values
	}

	/*
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {
		boolean twoOrMore = false; //establishing a boolean variable
		int value = Collections.frequency(integerList, intToFind); //finding the number of times the int value appears in the list
		if (value >= 2) { //if the number of occurrences is greater than or equal to 2
			twoOrMore = true; //change boolean value to true
		}
		return twoOrMore; //return the boolean value of twoOrMore
	}

	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
	should be replaced by the String "Fizz", any multiple of 5 should be replaced by the String "Buzz",
	and any multiple of both 3 and 5 should be replaced by the String "FizzBuzz"
	** INTERVIEW QUESTION **
	
	fizzBuzzList( {1, 2, 3} )  ->  [1, 2, "Fizz"]
	 fizzBuzzList( {4, 5, 6} )  ->  [4, "Buzz", 6]
	 fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
	
	 HINT: To convert an Integer x to a string you can call x.toString() in your code (e.g. if x = 1 then x.ToString()
	 equals "1")
	 */
	public List<String> fizzBuzzList(Integer[] integerArray) {
		List<String> newValues = new ArrayList<String>(); //creating new list for values to be stored (Strings)
		for (Integer number : integerArray) { //entering a for loop for each number in integerArray
			if ((number % 3 == 0) && (number % 5 == 0)) { //checking to see if the number is a multiple of 3 and 5
				newValues.add("FizzBuzz"); //if the value is a multiple of 3 and 5, add "FizzBuzz"

			} else if (number % 3 == 0){ //check to see if the number is JUST a multiple of 3 (hence why the starting if statement is both multiples)
				newValues.add("Fizz"); //if the number is JUST a multiple of 3, add "Fizz"

			} else if (number % 5 == 0){ //check to see if the number is JUST a multiple of 5
				newValues.add("Buzz"); //if the number is JUST a multiple of 5, add "Buzz"

			} else { //if none of the previous three criteria are satisfied...
				newValues.add(number.toString()); //add the value of the integer, except converting it to a string so it can be placed in the string list

			}
		}
		return newValues; //return the new String list
	}

	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
		List<Integer> allTogether = new ArrayList<Integer>(); //creating a new Integer list for the alternating values
		int biggerList = Math.max(listOne.size(), listTwo.size()); //check to see which string is larger
		for (int i = 0; i < biggerList; i++) { //based on which string is longer, enter a for loop (if one string is larger than the other, the if statement would lead to the larger one adding the remaining values to the end)
			if (i < listOne.size()) { //work through the length of the list, adding each value
				allTogether.add(listOne.get(i)); //add the value at the index (incrementing by one until done)
			}
			if (i < listTwo.size()) { //second if statement, because if it were an else, it would never alternate values
				allTogether.add(listTwo.get(i)); //add the value at the index from the second list (incrementing by one until done)
			}
		}
		return allTogether; //return the final form of the list
	}

}
