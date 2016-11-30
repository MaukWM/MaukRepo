package ss.week1;


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
	public Lamp () {
		value = OFF;
	}
	/**
	 *  This function changes the setting of the lamp up and turns it off
	 *  once it reaches the highest setting
	 */
	public void switchSetting() {
		value = (value + 1) % MAX;
	}
	/**
	 * This function returns the setting of the lamp at that given moment
	 */
	public int getSetting() {
		return value;
	}
}