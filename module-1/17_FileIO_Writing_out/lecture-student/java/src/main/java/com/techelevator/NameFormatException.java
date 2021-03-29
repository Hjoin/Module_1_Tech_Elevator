package com.techelevator;

public class NameFormatException extends Exception{

    @Override
    public String getMessage() {
        return "Didn't have sufficient information to create a formatted name.";
    }
}
