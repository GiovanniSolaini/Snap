package io.github.giovannisolaini.snap;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * SnapGame class, representing a game of Snap
 * @author Giovanni Solaini
 *
 */
public class SnapGame {
	private Deck deck = new Deck();
	
	private String player1;
	private String player2;
	
	/**
	 * SnapGame constructor, taking the names of the two players as parameters
	 * @param player1 - Player 1's name
	 * @param player2 - Player 2's name
	 */
	public SnapGame(String player1, String player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	/**
	 * Plays out a game of Snap between the two computer-controlled players
	 */
	public void play() {
		// setting up
		deck.shuffle();
		int turn = 0;
		Random rand = new Random();
		CardRank previousCardRank = null;
		boolean snapTime = false;
		
		// the turning card loop, which ends when two cards with the same value/rank are revealed
		// or when no cards are left in the deck
		while (!snapTime) {
			String currentPlayer = (turn % 2 == 0) ? player1 : player2;
			
			int timeout = 1000 + rand.nextInt(1000);
			
			try {
				TimeUnit.MILLISECONDS.sleep((long) timeout);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			Card nextCard = deck.turnCard();
			
			// possible draw if no cards are left in the deck
			if (nextCard == null) {
				System.out.println("No cards left in the deck! It's a draw!");
				return;
			}
			System.out.println(currentPlayer + " turns card \'" + nextCard + "\'");
			
			turn++;
			
			// trigger the end of the turning card loop
			if (nextCard.getCardRank() == previousCardRank) {
				snapTime = true;
			}
			previousCardRank = nextCard.getCardRank();
		}
		
		// simulate the time needed for both players to say "SNAP!"
		int snapTimeoutP1 = 500 + rand.nextInt(1000);
		int snapTimeoutP2 = 500 + rand.nextInt(1000);
		
		// rare draw situation, if the two players say "SNAP!" at the same time
		if (snapTimeoutP1 == snapTimeoutP2) {
			try {
				TimeUnit.MILLISECONDS.sleep((long) snapTimeoutP1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("SNAP! It's a draw!");
		}
		// in most cases, a player will say "SNAP!" first, and they will be the winner
		else {
			String result = String.format("SNAP! %s is the winner!", (snapTimeoutP1 < snapTimeoutP2) ? player1 : player2);
			
			try {
				TimeUnit.MILLISECONDS.sleep((long) Math.min(snapTimeoutP1, snapTimeoutP2));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(result);
		}
	}
}
