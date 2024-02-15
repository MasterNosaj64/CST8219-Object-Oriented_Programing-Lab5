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
 * Human class inherits the methods of Player
 * Human is a variant of Player
 * @author Jason Waid
 * @version 1.0
 *
 */
public class Human extends Player {

	protected Scanner in;
/**
 * Calls the Player constructor of the parent class
 * @param input
 * @return human player name
 */
	
	
	Human(Scanner input) {
		super(input.next());

		in=input;
		
	}
/**
 * Take turn prompts the user for input for a move
 * If the user doesn't use a valid input he/she will get an error message prompting to try again
 * The user also has the option to quit the game early
 * @param the move is stored and converted to upper case
 * @return the move the player took or the request to quit (R, P, S or Q)
 */
	@Override
	public boolean takeTurn() {
		// What happens if the Human class does not implement the takeTurn method?
		// Answer: Class won't be concrete, class would have to be abstract at that point
		String move;
		boolean x = false;

		do {
			System.out.println(
					name + ", it's your turn (Enter R for Rock, P for Paper, S for Scissors, or Q to quit):");
			move = in.next().substring(0, 1).toUpperCase();
			x = true;

			switch (move) {
			case "Q":
				return false;
			case "S":
			case "P":
			case "R":
				lastMove = HandSign.getHandSign(move);

				System.out.println(name + " played " + lastMove);
				break;
			default:
				System.out.println("Invalid input, please try again...");
				x = false;
			}
		} while (x == false);
		return true;
	}

}
