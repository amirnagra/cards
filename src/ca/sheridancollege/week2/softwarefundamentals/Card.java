/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 *
 * @author Ali Hassan
 */
public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
        if (suit.equalsIgnoreCase("Hearts")||suit.equalsIgnoreCase("spades")
                ||suit.equalsIgnoreCase("diamond")||suit.equalsIgnoreCase("clubs")){
            System.out.println("Plese enter hearts,  spades or diamond");
        }
        if (value<1 && value>13) {
            System.out.println("Plese enter the value from 1 to 13 ");
    }
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
}
