package com.techelevator;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		Map<String,String> groups = new HashMap<>(); //creating map
		groups.put("rhino", "Crash"); //adding map values
		groups.put("giraffe", "Tower");
		groups.put("elephant", "Herd");
		groups.put("lion", "Pride");
		groups.put("crow", "Murder");
		groups.put("pigeon", "Kit");
		groups.put("flamingo", "Pat");
		groups.put("deer", "Herd");
		groups.put("dog", "Pack");
		groups.put("crocodile", "Float");

		if(animalName == null || !groups.containsKey(animalName.toLowerCase())) { //checking to see if null or is not found
			return "unknown"; //if cannot be found, return "unknown"
		}
		return groups.get(animalName.toLowerCase()); //return the correct value once the animal name has been converted to all lowercase
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {
		Map<String, Double> salesGalore = new HashMap<>(); //creating new map
		salesGalore.put("KITCHEN4001", 0.20); //adding values to map
		salesGalore.put("GARAGE1070", 0.15);
		salesGalore.put("LIVINGROOM", 0.10);
		salesGalore.put("KITCHEN6073", 0.40);
		salesGalore.put("BEDROOM3434", 0.60);
		salesGalore.put("BATH0073", 0.15);

		if (itemNumber == null || !salesGalore.containsKey(itemNumber.toUpperCase())) { //checking to see if null or a value does not exist
			return 0.00; //return 0.00 if nothing found or null
		}
		return salesGalore.get(itemNumber.toUpperCase()); //return the sale price, and avoiding case sensitivity by converting to all uppercase
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		int peterCents = peterPaul.get("Peter"); //getting Peter's money
		int paulCents = peterPaul.get("Paul"); //getting Paul's money
		if (peterCents > 0 && paulCents < 1000) { //if Peter has more than 0 and Paul has less than 1000 cents
			if (peterCents % 2 != 0) { //checking to see if Peter's cash amount is an odd number
				peterCents = peterCents / 2; //divide Peter's amount in half
				paulCents = peterCents + paulCents; //give money to Paul
				peterCents++; //Peter's new value
			} else {
				peterCents = peterCents / 2; //divide Peter's amount in half
				paulCents = peterCents + paulCents; //give Paul half of Peter's money
			}
		}
			peterPaul.put("Peter", peterCents); //place Peter's amount
			peterPaul.put("Paul", paulCents); //place Paul's amount

			return peterPaul; //return final values
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		int peterCents = peterPaul.get("Peter"); //get Peter's money
		int paulCents = peterPaul.get("Paul"); //get Paul's money

		if (peterCents >=5000 && paulCents >= 10000) { //if Peter has more than 5000 cents and Paul has more than 10000 cents
			int peterContribution = peterCents / 4; //1/4th of Peter's money
			peterCents = peterCents - peterContribution; //Peter's new value

			int paulContribution = paulCents / 4; //1/4th of Paul's money
			paulCents = paulCents - paulContribution; //Paul's new value

			int combinedContribution = peterContribution + paulContribution; //combined contributions

			peterPaul.put("Peter", peterCents); //place new value for Peter
			peterPaul.put("Paul", paulCents); //place new value for Paul
			peterPaul.put("PeterPaulPartnership", combinedContribution); //place new value for their partnership
			return	peterPaul; //return final values
		}

		return peterPaul; //return final values if the if statement never passes
	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> singleCharacter = new HashMap<>(); //creating a new map
		for (String string : words) { //for each string in words
			singleCharacter.put(string.substring(0,1), string.substring(string.length() - 1)); //placing the first character as a key and the last character as a value
		}
		return singleCharacter; //return the character keys and values
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> frequencyOfString = new HashMap<>(); //create new map for values to be stored
		for (String string : words) { //for each string in words
			if(frequencyOfString.containsKey(string)) { //if the string is found
				int frequency = frequencyOfString.get(string); //set a numeric value
				frequency++; //increases the frequency value to the amount of times the string occurs
				frequencyOfString.put(string, frequency); //place the string with the amount of times the word appears
			} else {
				frequencyOfString.put(string, 1); //if the word does not appear multiple times, give the word a frequency of one
			}
		}
		return frequencyOfString; //return the strings with their frequencies
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> frequencyOfInt = new HashMap<>(); //create new map for values to be stored
		for (int integerValue : ints) { //for each integer in ints
			if(frequencyOfInt.containsKey(integerValue)) { //if the integer is found
				int frequency = frequencyOfInt.get(integerValue); //set a numeric value
				frequency++; //increases the frequency value to the amount of times the integer occurs
				frequencyOfInt.put(integerValue, frequency); //place the value with the amount of times the integer appears
			} else {
				frequencyOfInt.put(integerValue, 1); //if the integer does not appear multiple times, give the integer a frequency of one
			}
		}
		return frequencyOfInt; //return the integers with their frequencies
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> finalResult = new HashMap<>(); //creating map for the final answer
		Map<String, Integer> criteriaValue = new HashMap<>(); //creating a map to hold the value of frequencies

		for (String wordsAppearance : words) { //for each appear of a word/letter in words
			if(criteriaValue.containsKey(wordsAppearance)) { //if the word appears
			int count = criteriaValue.get(wordsAppearance); //create a variable to hold the value of the counts
			count++; //increase the value of the count for each appearance of the word
			if (count > 1) { //if the string appears 2 or more times
				finalResult.put(wordsAppearance, true); //set the final value to true and put into the final results map
			} else {
				finalResult.put(wordsAppearance, false); //if the count is not more than two, then put the final value of false into the map
			}
			} else { //if the word does not have multiple appearances
				criteriaValue.put(wordsAppearance, 1); //set appearance to one
				finalResult.put(wordsAppearance, false); //the condition is not met, therefore set the final value to false and add to final results
			}

		}
		return finalResult; //return the final results
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {
		Map<String, Integer> consolidatedValues = new HashMap<>(); //creating a new map for the combined list
		for (String value : mainWarehouse.keySet()) { //for each value in the mainWarehouse
			if (remoteWarehouse.containsKey(value)) { //if the remoteWarehouse also has the value
				consolidatedValues.put(value, (mainWarehouse.get(value) + remoteWarehouse.get(value))); //put the SKU (key) with the two values added together
			} else { //if the remoteWarehouse does not also have the value
				consolidatedValues.put(value, mainWarehouse.get(value)); //simply add the SKU (key) and the value located in the original mainWarehouse
			}
		}
		for (String value : remoteWarehouse.keySet()) { //for the values in the remoteWarehouse
			if (!mainWarehouse.containsKey(value)) { //if the mainWarehouse does not have the value (we already checked if they both existed in the previous loop)
				consolidatedValues.put(value, remoteWarehouse.get(value)); //simply add the value to the map with its value from the remoteWarehouse
			}
		}
		return consolidatedValues; //return the final map with the SKU's (keys) and their total values across both warehouses
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map<String, Integer> value = new HashMap<>(); //creating the map
		for (String key : words) { //for each key in the map words
			int count = 0; //establishing a count variable for the loop
			for (int i = 0; i < key.length() - 2; i++) { //starting at 0, checking each value and avoiding out of bounds error
				if(key.substring(i,i+2).equals(key.substring(key.length() - 2))) { //if the first two characters match the last two characters
					count++; //increase the count
				}

			}
			value.put(key, count); //put the key with the amount of times it appeared
		}
		return value; //return the final map
	}

}
