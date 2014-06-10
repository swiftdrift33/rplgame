package ca.bcit.comp2613.a00703441.util;

import ca.bcit.comp2613.rplgame.model.Player;
/**
 * 
 * @author 
 *
 */
public class TeamWithSelfException extends RuntimeException{

	private Player playerOne;
	
	/**
	 * default constructor
	 * @param playerOne
	 */
	public TeamWithSelfException(Player playerOne){
		this.playerOne = playerOne;		
	}
	
	/**
	 * over ridden toString method
	 * @return error message as a String
	 */
	public String toString(){
		return playerOne.getName() + " cannot form a team with themself";
	}
}
