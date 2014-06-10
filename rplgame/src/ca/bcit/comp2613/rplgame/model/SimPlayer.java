package ca.bcit.comp2613.rplgame.model;


/**
 * @author 
 * generates objects which represent simulated RPSLS players
 */
public class SimPlayer extends Player{
	
	private Gestures gestureBias;	
	
	/**
	 * default constructor
	 * 
	 * @param id as a long
	 * @param name as a String
	 * @param roundsPlayer as an int
	 * @param roundsWon as an int
	 * @param roundsLost as an int
	 * @param roundsTied as an int
	 * @param gestureBias as a Gestures
	 * 
	 */
	public SimPlayer(long id, String name, Integer roundsPlayed, Integer roundsWon,
			Integer roundsLost, Integer roundsTied, Gestures gestureBias) {
		super(id, name, roundsPlayed, roundsWon, roundsLost, roundsTied);
		this.gestureBias = gestureBias;		
	}
	
	/**
	 * overide toString method
	 */
	public String toString(){
		return super.getName();
	}

	/**
	 * get Gesture bias
	 * @return the gestureBias as a Gestures
	 */
	public Gestures getGestureBias() {
		return gestureBias;
	}

	/**
	 * set gesture bias
	 * @param gestureBias as a Gestures
	 */
	public void setGestureBias(Gestures gestureBias) {
		this.gestureBias = gestureBias;
	}	
	
	

}
