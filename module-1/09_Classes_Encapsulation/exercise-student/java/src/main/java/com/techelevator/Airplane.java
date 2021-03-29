package com.techelevator;

public class Airplane {

    private final String planeNumber; //instancing all variables
    private int bookedFirstClassSeats = 0;
    private int availableFirstClassSeats;
    private final int totalFirstClassSeats;
    private int bookedCoachSeats = 0;
    private int availableCoachSeats;
    private final int totalCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) { //establishing Airplane constructor
        this.planeNumber = planeNumber; //setting variables
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
        this.availableFirstClassSeats = totalFirstClassSeats;
        this.availableCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }
    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }
    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }
    public int getAvailableCoachSeats() { //figuring out how many available seats are left for coach
        availableCoachSeats = totalCoachSeats - bookedCoachSeats;
        return availableCoachSeats;
    }
    public int getAvailableFirstClassSeats() { //figuring out how many available seats are left for first class
        availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
        return availableFirstClassSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        getAvailableCoachSeats();
        getAvailableFirstClassSeats();

        if (forFirstClass && availableFirstClassSeats >= totalNumberOfSeats) { //used to calculate available/booked seats remaining in first class
            bookedFirstClassSeats += totalNumberOfSeats;
            return true;
        } else if (!forFirstClass && availableCoachSeats >= totalNumberOfSeats) { //used to calculate available/booked seats in coach
            bookedCoachSeats += totalNumberOfSeats;
            return true;
        }
        return false;

    }

}
