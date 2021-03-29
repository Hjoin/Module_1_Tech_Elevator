package com.techelevator;


public class Lecture {

    public static void main(String[] args) {

        Card firstCard = new Card();
        Card secondCard = new Card();
        Card thirdCard = new Card("King", "Hearts");
        System.out.println(firstCard); //prints out reference

        // secondCard.setSuit("Diamonds");
        // secondCard.setRank("Nine");
        // firstCard.setSuit("Clubs");
        System.out.println(firstCard.getSuit());
        System.out.println(secondCard.getSuit());
        System.out.println(secondCard.getRank());
        System.out.println(secondCard.isFaceUp());
        System.out.println(secondCard.getDescription());
        System.out.println(firstCard.getDescription());

        secondCard.setFaceUp(true);

        System.out.println(secondCard.getDescription() + " has a value of " + secondCard.getValue());
        System.out.println(thirdCard.getDescription() + " has a value of " + thirdCard.getValue());

        Card fourthCard = new Card("Queen","Hearts");
        System.out.println(fourthCard.getDescription());
        fourthCard.flip();

        System.out.println(fourthCard.getDescription());
        System.out.println(fourthCard.getValue());

        if (fourthCard.isHigherThan(secondCard)) {
            System.out.println("Fourth card is higher");
        } else {
            System.out.println("Second card is higher");
        }

        final int num;
        num = 10;
        //Can't change it after that.

        System.out.println(Card.shape);

        Card.shape = "Round";

        System.out.println(Card.shape);

        Deck myDeck = new Deck();
        myDeck.shuffle();
        Card firstPick = myDeck.drawCard();
        firstPick.flip();
        System.out.println(firstPick.getDescription());

        while (myDeck.getCardCount() > 0) {
            Card pick = myDeck.drawCard();
            pick.flip();
            System.out.println(pick.getDescription());
        }

    }
}
