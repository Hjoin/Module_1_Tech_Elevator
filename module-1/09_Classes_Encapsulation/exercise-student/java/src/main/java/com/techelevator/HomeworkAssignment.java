package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks; //instancing variables
    private final int possibleMarks;
    private final String submitterName;

    public HomeworkAssignment(int possibleMarks, String submitterName){ //setting the Homework Constructor
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }
    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
    public int possibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {
        double earnedMarksDouble = earnedMarks;
        double grade = ((earnedMarksDouble / (double) possibleMarks) * 100); //calculating the grade and making sure that it is a double

        String letterGrade; //a way to check the grade and allocate the proper grade for the score
        if (grade >= 90) { //each range allocated to a letterGrade
            letterGrade = "A";
        } else if (grade >= 80) {
            letterGrade = "B";
        } else if (grade >= 70) {
            letterGrade = "C";
        } else if (grade > 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade; //returning the appropriate letterGrade for the score
    }


}