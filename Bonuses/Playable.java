/*
 * Name:Jason Waid
 * Student ID:040912687
 * Course & Section: CST8132 304
 * Assignment: Lab 5
 * Date: Oct 26th, 2018
 */
package rps;
/**
 * Playable provides the fundamental tools for the game to work
 * @author Jason Waid
 *@version 1.0
 */
public interface Playable {

	int NUM_PLAYERS = 2;
	// What is the access level of this property?
	// Is it a class or instance property?
	//Answer: Public, it is a class
/**
 * initializes players
 */
	public void initPlayers();
/**
 * Plays game
 */
	public void play();
/**
 * Determines who wins the round
 */
	public void evaluateRound();
/**
 * displays results
 */
	public void displayResults();

	// What is the access level of these methods?
	// Public
	// Are they abstract or concrete?
	// Abstract
}
