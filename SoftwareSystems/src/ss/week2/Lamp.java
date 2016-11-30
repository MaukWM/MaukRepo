package ss.week2;


/** 
 * Function for the Lamp 
 */
public class Lamp {
	/**
	 *  Establish the value of the settings of the lamp and the maximum number
	 *  for which the setting of the lamp is undefined.
	 */
	private int value;
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	public static final int MAX = 4;
	
	/**
	 *  When Lamp loads the constructor sets the starting value to OFF
	 */
	//@ private invariant value <= 4 && value >= 0;
	
	//@ ensures this.getSetting() == OFF;
	//@ pure;
	public Lamp () {
		value = OFF;
		
	}
	/**
	 *  This function changes the setting of the lamp up and turns it off
	 *  once it reaches the highest setting
	 */
	//@ ensures this.getSetting() == \old((this.getSetting()) + 1) % MAX;
	//@ ensures \old(getSetting() == OFF) ==> (getSetting() == LOW);
	//@ ensures \old(getSetting() == LOW) ==> (getSetting() == MEDIUM);
	//@ ensures \old(getSetting() == MEDIUM) ==> (getSetting() == HIGH);
	//@ ensures \old(getSetting() == HIGH) ==> (getSetting() == OFF);
	public void switchSetting() {
		value = (value + 1) % MAX;
	}
	/**
	 * This function returns the setting of the lamp at that given moment
	 */
	//@ pure;
	public int getSetting() {
		return value;
	}
}