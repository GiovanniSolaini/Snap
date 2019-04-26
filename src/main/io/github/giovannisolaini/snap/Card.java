package io.github.giovannisolaini.snap;

/**
 * Card class, representing a card in a standard 52-card deck of French playing cards, with a rank and a symbol
 * @author Giovanni Solaini
 *
 */
public class Card {

	private CardSymbol cardSymbol;
	private CardRank cardRank;
	
	public Card(CardSymbol cardSymbol, CardRank cardValue) {
		this.cardSymbol = cardSymbol;
		this.cardRank = cardValue;
	}

	public CardSymbol getCardSymbol() {
		return cardSymbol;
	}

	/**
	 * Getter for the card's value/rank
	 * @return The value/rank of the card
	 */
	public CardRank getCardRank() {
		return cardRank;
	}

	@Override
	public String toString() {
		return cardRank + " of " + cardSymbol;
	}
	
}
