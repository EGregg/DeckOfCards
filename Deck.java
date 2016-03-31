package objectCreator;

import java.util.*;

public class Deck {

	public static void main(String[] args) {
		ArrayList deck3 = new ArrayList();
		System.out.println(deck3.size());
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		for (String suit : suits) {
			for (String rank : ranks) {
				Card tempCard = new Card(suit, rank);
				deck3.add(tempCard);
				System.out.println(tempCard.suit + " of " + tempCard.rank);
			}
			
		}
		System.out.println(deck3.size());	
	}
	
}