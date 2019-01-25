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
public class CardDemo {
    public static void main (String args[]){
        
        Card c1 = new Card ("Hearts", 100);
        System.out.println(c1.getValue() + " of " + c1.getSuit());
    }
    
}
