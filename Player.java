/*
 * Name:Jason Waid
 * Student ID:040912687
 * Course & Section: CST8132 304
 * Assignment: Lab 5
 * Date: Oct 26th, 2018
 */
package rps;
/**
 * Collects the required information for any player such as ties, wins, name, last move
 * @author Jason Waid
 *@version 1.0
 */
public abstract class Player {

	// Variables
	protected String name;
	protected HandSign lastMove;
	protected int wins;
	protected static int ties = 0;
/**
 * initializes wins and name for player
 * @param playerName
 * @return returns the player name
 */
	// Constructs a player
	public Player(String playerName) {
		name = playerName;
		wins = 0;
	}
/**
 * Store the name of the player
 * @return name of given player
 */
	// Gets name of player
	protected String getName() {
		return name;

	}
/**
 * Stores the last move the player took
 * @return last move of given player
 */
	// Gets move played by player
	protected HandSign getLastMove() {

		return lastMove;

	}
/**
 * the gets the wins for the player
 * @return number of wins for given player
 */
	// Gets # of wins
	protected int getWins() {

		return wins;

	}
/**
 * this holds the ties during the game
 * @return number of ties for players
 */
	// Gets # of ties for player
	protected static int getTies() {

		return ties;
	}
/**
 * adds to winners score upon winning a game
 * @return increments wins
 */
	// When player wins increments win variable
	protected void win() {

		wins++;
	}
/**
 * add to the ties for the game when a tie takes place
 * @return increments ties
 */
	// When players tie increments shared tie variable
	protected static void tie() {

		ties++;
	}
/**
 * prints the results for the given player
 * @return results for player
 */
	// Controls print of results
	@Override
	public String toString() {
		// System.out.print("Player: " +name+ "\n Wins: "+wins);
		return "Player: " + name + "\nWins: " + wins;
	}
/**
 * can be used to quit game if returned false, or used to implement the player taking his turn
 * @return true if turn take, false if turn is denied
 */
	// Determines if player took turn or not
	protected abstract boolean takeTurn();

}
