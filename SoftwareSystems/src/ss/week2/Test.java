package ss.week2;

/**
 * Function to test Lamp.
 */
public class Test {

	/**
	 * Run a Lamp test
	 */
	public static void main(String[] argv) {
		(new LampTest()).runTest();
	}
}
	class LampTest {
		private Lamp setting; // Object to test

		/**
		 * Create a Test for the Lamp through constructor.
		 */
		public LampTest() {
			setting = new Lamp();
		}

		/**
		 * Run the test.
		 */
		public void runTest() {
			testInitialState();
			testChange();
		}
		
	/**
	 * Test the initial state of the Lamp
	 */
	private void testInitialState () {
		System.out.println("testInitialState:");
		System.out.println("Initial setting: " + setting.getSetting()); 
	}
	
	/**
	 * Test all changes in Lamp
	 */
	private void testChange () {
		System.out.println("testChange:");
		System.out.println("Starting setting: " + setting.getSetting());
		setting.switchSetting();
		System.out.println("1 Change: " +setting.getSetting());
		setting.switchSetting();
		System.out.println("2 Change: " +setting.getSetting());
		setting.switchSetting();
		System.out.println("3 Change: " +setting.getSetting());
		setting.switchSetting();
		System.out.println("4 Change: " +setting.getSetting());
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	