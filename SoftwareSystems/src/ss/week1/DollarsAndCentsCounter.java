package ss.week1;


/**
 *  A counter for Dollars and Cents
 */
public class DollarsAndCentsCounter {
	private int dollars;
	private int cents;
	
	/**
	 * The dollar count
	 * this.dollars() >= 0
	 */
	public int dollars() {
			return dollars;
	}
		
	/**
	 * The cents count
	 * 0 <= this.cents() && this.cents() <= 99
	 */
	public int cents() {
			return cents;
	}
	
	/**
	 * Add the specified dollars and cents to the Counter
	 */
	public void add (int dollarz, int centz) {
		dollars = dollars + dollarz + (centz + cents)/100;
		cents = (cents + centz)%100;
	}
	
	/**
	 *  Reset counter to 0
	 */
	public void reset() {
		dollars = 0;
		cents = 0;
	}
	
}
