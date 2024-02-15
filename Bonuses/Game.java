/*
 * Name:Jason Waid
 * Student ID:040912687
 * Course & Section: CST8132 304
 * Assignment: Lab 5
 * Date: Oct 26th, 2018
 */
package rps;

import java.util.Scanner;
/**
 * Game initializes the size of the players array,starts the scanner and closes it
 * @author Jason Waid
 *@version 1.0
 */
public abstract class Game implements Playable {

	int numRounds; // Variable contains number of rounds
	protected Scanner in; // input Scanner
	Player[] players; // Array for number of players
/**
 * Game constructor is the embodiment of every round in the game
 * @param numofRounds
 */
	Game(int numofRounds) {
		numRounds = numofRounds;
		players = new Player[NUM_PLAYERS];
		in = new Scanner(System.in);
		initPlayers();

		// How can the Game class invoke the method initPlayers without getting an
		// error,
		// if it has not yet been defined?
		// Answer: Because its abstract, its been declared already
	}
	/**
	 * closes the scanner
	 */
	@Override
	protected void finalize() {
		try {
			in.close();
		} catch (Exception e) {
		}
	}
}
