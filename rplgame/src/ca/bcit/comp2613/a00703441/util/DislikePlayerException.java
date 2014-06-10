package ca.bcit.comp2613.a00703441.util;

import ca.bcit.comp2613.rplgame.model.Player;

/**
 * @author 
 */
public class DislikePlayerException extends RuntimeException {
	
	
	private Player playerOne;
	private Player playerTwo;
	
	/**
	 * default constructor
	 * @param playerOne as a Player
	 * @param playerTwo as a Player
	 */
	public DislikePlayerException(Player playerOne, Player playerTwo){
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}
	
	/**
	 * over ridden toString method
	 * @return error message as a String
	 */
	public String toString(){
		return "players " + playerOne.getName()+ " and " +  playerTwo.getName() + " don't like each other";
	}

}