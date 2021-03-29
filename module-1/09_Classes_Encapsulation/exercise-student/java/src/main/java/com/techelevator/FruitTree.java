package com.techelevator;

public class FruitTree {
    public String typeOfFruit; //instancing variables
    private int piecesOfFruitLeft;

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit){ //FruitTree constructor
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit; //starting amount of fruit
    }

    public boolean pickFruit(int numberOfPiecesToRemove) {
        if (piecesOfFruitLeft - numberOfPiecesToRemove < 0) { //used to calculate remaining fruit left (makes sure enough fruit is available to be picked first)
            piecesOfFruitLeft = 0;
            return false;
        } else {
            piecesOfFruitLeft -= numberOfPiecesToRemove; //reducing fruits left
            return true;
        }
    }

}