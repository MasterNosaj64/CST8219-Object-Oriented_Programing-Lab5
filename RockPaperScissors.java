/*
 * Name:Jason Waid
 * Student ID:040912687
 * Course & Section: CST8132 304
 * Assignment: Lab 5
 * Date: Oct 26th, 2018
 */
package rps;

/**
 * RockPaperScissors plays through the number of rounds and determines what do
 * do when the round is either a win, tie or loss. After the game is done it
 * will display the final results and thank the players for playing
 * @author Jason Waid
 *@version 1.0
 */
public class RockPaperScissors extends Game {

	// Calls game super constructor
	RockPaperScissors(int x) {
		super(x);
	}

	/**
	 * initPlayers gets the name of the human player and initializes the index of the players array for each player
	 * @param players[] - the index value for human and computer (0 = human, 1 = player)
	 * @return Creates 2 player objects, one for human and one for player
	 */

	// Prompts user for name and assigns players in the array index
	@Override
	public void initPlayers() {
		System.out.println("Please enter name:");

		players[0] = new Human(in); // Human
		players[1] = new Computer(); // Computer
	}

	
	/**
	 * play is what will quit the game when the human wants to quit, if not it will force the computer to make a move
	 * @param the current round represented by r
	 * @return if the human doesn't quit the round will play out and will be evaluated by the evaluateRound method
	 */
	// Plays the game thru number of rounds
	@Override
	public void play() {
		for (int r = 0; r < numRounds; r++) {
			if (players[0].takeTurn() == false) {
				break;
			} else
				players[1].takeTurn();
			evaluateRound();

		}

	}
/**
 * Evaluates the outcome of the round and outputs the results of the round
 * @param the last move for each player is collected from the array of players, then compared to HandSign to determine which player wins or if it is a tie.
 * @return the winner is returned
 */
	// Evaluates who won the round
	@Override
	public void evaluateRound() {

		HandSign[] moves = new HandSign[] { players[0].getLastMove(), players[1].getLastMove() };

		int winner = HandSign.getWinner(moves);

		if (winner == -1) {
			Player.tie();
			System.out.println("It's a tie!");
			System.out.println("Ties: " + Player.getTies());
		} else {
			System.out.println(players[winner].getLastMove() + " beats " + players[Math.abs(winner - 1)].getLastMove()
					+ "! " + players[winner].getName() + " wins!\n");
			players[winner].win();
		}
	}
/**
 * the final results of the game are displayed and the program ends
 * @param the game could either be a tie, or a win for either player
 * @return the wins, loses per player and the total number of ties in the game
 */
	// Displays the results after the game has finished
	@Override
	public void displayResults() {
		Player winner = null;

		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i].toString());

			if (players[i].getWins() > (numRounds / NUM_PLAYERS)) {
				winner = players[i];

			}
		}
		System.out.println("Tie Games: "+Player.getTies());
		if (winner == null) {
			System.out.println("\nIt's a tie game!");
		}
		if (winner != null) {

			System.out.println("\nThe winner is " + winner.getName());

		}

		System.out.println("Thanks for playing Rock, Paper, Scissors. Bye!");
	}
}
