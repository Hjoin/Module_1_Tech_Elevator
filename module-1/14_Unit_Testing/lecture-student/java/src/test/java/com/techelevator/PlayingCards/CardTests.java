package com.techelevator.PlayingCards;

import com.techelevator.playingcards.Card;
import com.techelevator.playingcards.Suit;
import org.junit.Assert;
import org.junit.Test;

public class CardTests {

    @Test
    public void no_arg_constructor_makes_ace_of_spades() {
        //Arrange & Act
        Card sut = new Card();
        //Assert
        Assert.assertEquals("Ace",sut.getRank());
        Assert.assertEquals(Suit.SPADES, sut.getSuit());
    }

    @Test
    public void constructor_makes_specified_card() {
        //Arrange & Act
        Card sut = new Card("Jack", Suit.DIAMONDS);
        //Assert
        Assert.assertEquals("Jack",sut.getRank());
        Assert.assertEquals(Suit.DIAMONDS, sut.getSuit());
    }

    @Test
    public void getDescription_returns_back_of_card_when_face_down() {
        //Arrange
        Card sut = new Card();
        sut.setFaceUp(false);

        //Act
        String description = sut.getDescription();

        //Assert
        Assert.assertEquals("Back of Card", description);
    }

    @Test
    public void getDescription_returns_back_of_card_when_face_up() {
        //Arrange
        Card sut = new Card();
        sut.setFaceUp(true);

        //Act
        String description = sut.getDescription();

        //Assert
        Assert.assertEquals("Ace of Spades", description);
    }

    @Test
    public void getValueForRank_returns_correct_value_for_ace() {
        //Arrange
        String rank = "Ace";

        //Act
        int value = Card.getValueForRank(rank);

        //Assert
        Assert.assertEquals(14, value);


    }

    @Test
    public void getValueForRank_returns_zero_for_invalid_ranks() {
        Assert.assertEquals(0, Card.getValueForRank(""));
        Assert.assertEquals(0, Card.getValueForRank(null));
        Assert.assertEquals(0, Card.getValueForRank("blah"));
    }

    @Test
    public void flip_changes_faceUp_to_faceDown() {
        Card sut = new Card();
        sut.setFaceUp(true);

        sut.flip();

        Assert.assertFalse(sut.isFaceUp());
    }

    @Test
    public void flip_changes_faceDown_to_faceUp() {
        Card sut = new Card();
        sut.setFaceUp(false);

        sut.flip();

        Assert.assertTrue(sut.isFaceUp());
    }

    @Test
    public void isHigherThan_returns_true() {
        Card sutOne = new Card("Ace", Suit.DIAMONDS);
        Card sutTwo = new Card("Two", Suit.CLUBS);

        Assert.assertTrue(sutOne.isHigherThan(sutTwo));
    }

    @Test
    public void getHalfValue_returns_two_and_a_half_for_five() {
        Card sut = new Card("Five", Suit.CLUBS);

        double value = sut.getHalfValue();

        Assert.assertEquals(2.5, value, .0001);
    }

}
