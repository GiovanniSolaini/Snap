package io.github.giovannisolaini.snap;

/**
 * Card class, representing a card in a standard 52-card deck of French playing cards, with a rank and a symbol
 * @author Giovanni Solaini
 *
 */
public class Card {

	private CardSymbol cardSymbol;
	private CardRank cardRank;
	
	/**
	 * Card constructor, taking a symbol and a rank as values
	 * @param cardSymbol - The card's symbol
	 * @param cardRank - The card's rank
	 */
	public Card(CardSymbol cardSymbol, CardRank cardRank) {
		this.cardSymbol = cardSymbol;
		this.cardRank = cardRank;
	}

	/**
	 * Getter for the card's symbol
	 * @return The symbol of the card
	 */
	public CardSymbol getCardSymbol() {
		return cardSymbol;
	}

	/**
	 * Getter for the card's rank
	 * @return The rank of the card
	 */
	public CardRank getCardRank() {
		return cardRank;
	}

	@Override
	public String toString() {
		return cardRank + " of " + cardSymbol;
	}
	
}
