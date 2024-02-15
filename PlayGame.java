/*
 * Name:Jason Waid
 * Student ID:040912687
 * Course & Section: CST8132 304
 * Assignment: Lab 5
 * Date: Oct 26th, 2018
 */
package rps;
/**
 * Controls how many iterations of the game to play and call the play and displayresults methods to play the game
 * @author Jason Waid
 *@version 1.0
 */
public class PlayGame {
	// Programs starts here
	
	/**
	 * Program executes from this point
	 * @param args
	 */
	
	public static void main(String[] args) {

		// Creates 3 copies of game (one copy per round)
		Playable game = new RockPaperScissors(3);
		// Calls play method from playable to start the game
		game.play();
		// Calls displayResults method to show results
		game.displayResults();
	}
}
