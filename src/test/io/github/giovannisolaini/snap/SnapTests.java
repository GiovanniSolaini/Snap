package io.github.giovannisolaini.snap;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class SnapTests {

	@Test
	void deckShouldBeMadeOf52CardsTest() {
		Deck deck = new Deck();
		assertTrue(deck.getCards().size() == 52);
	}
	
	@Test
	void deckShouldHave13CardsOfEachSymbolTest() {
		Deck deck = new Deck();
		
		Map<CardSymbol, Integer> symbolAppearancesPerCard = new HashMap<CardSymbol, Integer>();
		
		for (CardSymbol symbol : CardSymbol.values()) {
			symbolAppearancesPerCard.put(symbol, 0);
		}
		
		for (Card card : deck.getCards()) {
			symbolAppearancesPerCard.put(card.getCardSymbol(), symbolAppearancesPerCard.get(card.getCardSymbol()) + 1);
		}
		
		for (CardSymbol symbol : CardSymbol.values()) {
			assertTrue(symbolAppearancesPerCard.get(symbol) == 13);
		}
	}
	
	@Test
	void deckShouldHave4OfEachValueTest() {
		Deck deck = new Deck();
		
		Map<CardRank, Integer> valueAppearancesPerCard = new HashMap<CardRank, Integer>();
		
		for (CardRank value : CardRank.values()) {
			valueAppearancesPerCard.put(value, 0);
		}
		
		for (Card card : deck.getCards()) {
			valueAppearancesPerCard.put(card.getCardRank(), valueAppearancesPerCard.get(card.getCardRank()) + 1);
		}
		
		for (CardRank value : CardRank.values()) {
			assertTrue(valueAppearancesPerCard.get(value) == 4);
		}
	}
	
	@Test
	void turnCardShouldReturnCardFromANonEmptyDeckTest() {
		Deck deck = new Deck();
		while (!deck.getCards().isEmpty()) {
			assertTrue(deck.turnCard() != null);
		}
	}
	
	@Test
	void turnCardShouldReturnNullFromEmptyDeckTest() {
		Deck deck = new Deck();
		while (!deck.getCards().isEmpty()) {
			deck.turnCard();
		}
		assertTrue(deck.turnCard() == null);
	}

}
