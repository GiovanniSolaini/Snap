package io.github.giovannisolaini.snap;

import java.util.Scanner;

/**
 * Main class, which starts the game and gives the possibility to restart it after it finishes
 * @author Giovanni Solaini
 *
 */
public class Main {
	
	public static void main(String[] args) {
		SnapGame snapGame = new SnapGame("George", "Desmond");
		Scanner in = new Scanner(System.in);
		
		boolean keepPlaying = true;
		while(keepPlaying) {
			snapGame.play();
			
			System.out.print("The game is over! Input Y/y to restart, or any other input to close the program.");
			
			if (!in.nextLine().equalsIgnoreCase("y")) {
				keepPlaying = false;
			}
			
		}
		in.close();
		
	}

}
