package io.github.giovannisolaini.snap;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Deck class, representing a standard 52-card deck of French playing cards
 * @author Giovanni Solaini
 *
 */
public class Deck {
	private List<Card> cards = new ArrayList<Card>();

	/**
	 * Deck constructor, which creates 52 cards as in a standard French playing cards deck
	 */
	public Deck() {
		for (CardSymbol cardSymbol : CardSymbol.values()) {
			for (CardRank cardRank : CardRank.values()) {
				cards.add(new Card(cardSymbol, cardRank));
			}
		}
	}
	
	/**
	 * A method that returns the top card from the deck and removes it,
	 * or returns null if the deck is empty
	 * @return a valid, initialised Card if the Deck isn't empty, or null if it is
	 */
	public Card turnCard() {
		if (!cards.isEmpty()) {
			return cards.remove(0);
		}
		else {
			return null;
		}
	}
	
	/**
	 * A method that shuffles the deck
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	/**
	 * Getter for the cards
	 * @return an ArrayList of Cards
	 */
	public List<Card> getCards() {
		return cards;
	}
}
