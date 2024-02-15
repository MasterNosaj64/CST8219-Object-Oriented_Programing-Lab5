/*
 * Name:Jason Waid
 * Student ID:040912687
 * Course & Section: CST8132 304
 * Assignment: Lab 5
 * Date: Oct 26th, 2018
 */
package rps;

import java.util.Random;
/**
 * Computer is a variation of the player class which is controlled by the computer
 * @author Jason Waid
 *@version 1.0
 */
public class Computer extends Player {
/**
 * Calls the super constructor of the part class to give the computer the name "Hal"
 * @Return Computer player name
 */
	public Computer() {
		super("Hal");
	}

	// Would it be possible to use the implicit
	// default constructor of the Computer class?
	// Answer: No
/**
 * A variation of the take turn method of the parent class, this variation uses the random method to select a move when its the computers turn
 * @param random variable that selects a random value between 1 and 3 (R, P, S)
 * @return Move the computer takes
 */
	// Computer takes turn
	protected boolean takeTurn() {

		Random random = new Random();

		// What type of variable is this? Private
		// What scope of this variable?
		// Does this require Java-doc - why or why not? No

		//Assigns random move for computer player
		lastMove = HandSign.values()[random.nextInt(3)];

		// Prompt computer player to take its turn
		System.out.println(this.name + ", it's your turn!");
		// Prints the computer player move
		System.out.println(this.name + " played " + lastMove);

		return true;

	}
}
