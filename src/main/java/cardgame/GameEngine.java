package cardgame;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Collections;
import java.util.Objects;

import cardgame.Card.Suit;


/** Create a class having players and their initial cards */

public class GameEngine{
    /** remove cards from players */
    List<Card> removecardlist = new ArrayList<>();

    
    public static void main(String args[]){  

        /** Create a deck of cards  */
    List<Card> deck  = Card.getDeck();
    Collections.shuffle(deck);
        /** Create list to each player  */
    List<Card> player1 = new ArrayList<>();
    List<Card> player2 = new ArrayList<>();
    List<Card> player3 = new ArrayList<>();
    List<Card> player4 = new ArrayList<>();


    
         /** provideing each player with 5 cards  */
        for(int i = 0; i<=16;i=i+4){
            player1.add(deck.get(i));
            player2.add(deck.get(i+1));
            player3.add(deck.get(i+2));
            player4.add(deck.get(i+3));
        }

         deck.subList(0,20).clear();
         System.out.println(deck.size());
        for(int i = 0; i<deck.size();i++){
            System.out.println(deck.get(i).getRank()+" "+deck.get(i).getSuit());
        }
        System.out.println("----------------------");
        for(int i = 0; i<player1.size();i++){
            System.out.println(player1.get(i).getRank()+" "+player1.get(i).getSuit());
        }
        System.out.println("----------------------");
        for(int i = 0; i<player2.size();i++){
            System.out.println(player2.get(i).getRank()+" "+player2.get(i).getSuit());
        }
        System.out.println("----------------------");
        for(int i = 0; i<player3.size();i++){
            System.out.println(player3.get(i).getRank()+" "+player3.get(i).getSuit());
        }
        System.out.println("----------------------");
        for(int i = 0; i<player4.size();i++){
            System.out.println(player4.get(i).getRank()+" "+player4.get(i).getSuit());
        }

        System.out.println("----------------------");

        Card topCard = deck.get(0);
        System.out.println(topCard.getRank()+" "+topCard.getSuit());
} 





}
