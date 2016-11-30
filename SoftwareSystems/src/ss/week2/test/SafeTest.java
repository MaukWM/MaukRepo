package ss.week2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import ss.week2.hotel.*;

public class SafeTest {

	private Safe activesafe;
	private Safe inactivesafe;
	
	@Before
	public void setUp() throws Exception {
		activesafe = new Safe();
		inactivesafe = new Safe(false, false);
	}

	/**
	 * The test below is used to test what happens when an Active Safe is opened with the
	 * correct password while closed, and then while opened.
	 */
	@Test
	public void testActiveINITIALword() {
		activesafe.activate("INITIAL");
		assertTrue(activesafe.isActive());
		activesafe.open("INITIAL");
		assertTrue(activesafe.isOpen);
		activesafe.open("INITIAL");
		assertTrue(activesafe.isOpen);
	}
	
	/**
	 * The test below is used to test what happens when an Active Safe is opened with an
	 * incorrect password while closed and while opened.
	 */
	@Test
	public void testActiveWrongPassword() {
		activesafe.activate("INITIAL");
		assertTrue(activesafe.isActive());
		activesafe.open("INCORRECTPASSWORD");
		assertFalse(activesafe.isOpen);
		activesafe.open("INITIAL");
		assertTrue(activesafe.isOpen);
		activesafe.open("INCORRECTPASSWORD");
		assertTrue(activesafe.isOpen());
	}
	
	/**
	 * This test tests whether the functions activate and deactivate work with the correct password
	 */
	@Test 
	public void testINITIALwordActivate() {
		assertFalse(inactivesafe.isActive());
		inactivesafe.activate("INITIAL");
		assertTrue(inactivesafe.isActive());
		inactivesafe.deactivate();
		assertFalse(inactivesafe.isActive());
	}
	
	/**
	 * This test tests whether the activate function activate works with an incorrect password
	 */
	@Test 
	public void testINCORRECTPASSWORDwordActivate() {
		assertFalse(inactivesafe.isActive());
		inactivesafe.activate("INCORRECTPASSWORD");
		assertFalse(inactivesafe.isActive());
	}
	
	
	/**
	 * The test below is used to test what happens when an Inactive Safe is opened with an
	 * correct password while closed and while opened.
	 */
	@Test
	public void testInactiveINITIALword() {
		assertFalse(inactivesafe.isActive());
		inactivesafe.open("INITIAL");
		assertFalse(activesafe.isOpen);
		inactivesafe.close();
		assertFalse(activesafe.isOpen);
	}
	
	/**
	 * The test below is used to test what happens when an Inactive Safe is opened with an
	 * incorrect password while closed and while opened.
	 */
	@Test
	public void testInactiveINCORRECTPASSWORDword() {
		assertFalse(inactivesafe.isActive());
		inactivesafe.open("INCORRECTPASSWORD");
		assertFalse(activesafe.isOpen);
		inactivesafe.close();
		assertFalse(activesafe.isOpen);
	}
		
	/**
	 * The test below is used to test what happens when an Inactive Safe is opened with a
	 * correct password twice.
	 */
/**	@Test
	public void testDoubleActivateWhenClosedCorrectPassword() {
		assertFalse(inactivesafe.isActive());
		inactivesafe.activate("INITIAL");
		assertTrue(inactivesafe.isActive());
		inactivesafe.activate("INITIAL");
		assertTrue(inactivesafe.isActive());
	}
	
	/**
	 * The test below is used to test what happens when an Inactive Safe is opened with a
	 * correct password twice.
	 */
/**	@Test
	public void testDoubleActivateWhenClosedIncorrectPassword() {
		assertFalse(inactivesafe.isActive());
		inactivesafe.activate("INITIAL");
		assertTrue(inactivesafe.isActive());
		inactivesafe.activate("INITIAL");
		assertTrue(inactivesafe.isActive());
	}*/
}

