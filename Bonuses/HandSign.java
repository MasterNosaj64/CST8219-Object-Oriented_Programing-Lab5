package rps;

/**
 * Define an enumeration called Sign, with 3 elements, referred to as:
 * HandSign.SCISSORS, HandSign.PAPER, HandSign.ROCK.
 * 
 * @author Angela Giddings
 * @version 1.1
 * @since 1.8
 */
public enum HandSign {

	ROCK, PAPER, SCISSORS, LIZARD, SPOCK;

	/**
	 * Get the HandSign for a given letter.
	 * 
	 * @param firstLetter
	 *            The letter representing a HandSign value (R, P, S, L, K).
	 * @return The HandSign value which corresponds to the given letter, otherwise
	 *         return null.
	 */
	public static HandSign getHandSign(String firstLetter) {
		for (HandSign h : HandSign.values())
			if (h.name().startsWith(firstLetter.toUpperCase()) || (h.name().equals("SPOCK")))
				return h;
			
		return null;
	}

	public static int getWinner(HandSign[] moves) {
		if (moves[0] == moves[1]){
			return -1;
		}
		else if ((moves[0] == HandSign.SCISSORS && moves[1] == HandSign.PAPER) ||
				 (moves[0] == HandSign.SCISSORS && moves[1] == HandSign.LIZARD) ||
				 (moves[0] == HandSign.PAPER && moves[1] == HandSign.ROCK) ||
				(moves[0] == HandSign.PAPER && moves[1] == HandSign.SPOCK) ||
				(moves[0] == HandSign.ROCK && moves[1] == HandSign.LIZARD) ||
				(moves[0] == HandSign.ROCK && moves[1] == HandSign.SCISSORS) ||
				(moves[0] == HandSign.LIZARD && moves[1] == HandSign.PAPER) ||
				(moves[0] == HandSign.LIZARD && moves[1] == HandSign.SPOCK)||
				(moves[0] == HandSign.SPOCK && moves[1] == HandSign.SCISSORS) ||
				(moves[0] == HandSign.SPOCK && moves[1] == HandSign.ROCK)){
			return 0;
		} 
		else {
			return 1;
		}
	}
}
