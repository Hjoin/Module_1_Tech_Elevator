package com.techelevator;

public class Elevator {
    private int currentFloor = 1; //establishing a variable for the current floor
    private final int numberOfFloors; //establishing a variable for number of floors
    private boolean doorOpen; //establishing a boolean for whether the door is open or not

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public Elevator(int totalNumberOfFloors) { //creating Elevator constructor
        this.numberOfFloors = totalNumberOfFloors; //total number of floors in the building
    }

    public void openDoor() { //method to open the elevator doors
        doorOpen = true;
    }

    public void closeDoor() { //method to close the elevator doors
        doorOpen = false;
    }
    public void goUp(int desiredFloor) { //method to go up in the elevator to the desired floor
        if (!doorOpen && desiredFloor <= numberOfFloors && //makes sure door is closed, and the desired floor is in the correct range (higher than current floor, and lower than or equal to the total floors available)
                desiredFloor > currentFloor) {
            currentFloor = desiredFloor; //going to the desired floor if the criteria are met
        }
    }

    public void goDown(int desiredFloor) { //method to go down in the elevator to the desired floor
        if (!doorOpen && desiredFloor >= 1 && //makes sure the door is closed, and the desired floor is in the correct range (lower than the current floor, and the user cannot go below floor 1)
                desiredFloor < currentFloor) {
            currentFloor = desiredFloor; //going to the desired floor if the criteria are met
        }
    }



}