package ss.week2;

import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import static org.junit.Assert.assertEquals;
import org.junit.rules.ExpectedException;

/**
 * Testprogram for Rectangle
 * @author Mauk
 * @version 1.0
 */
public class RectangleTest {
	private Rectangle rectangle1;
	private Rectangle rectangle2;
	private Rectangle rectangle3;
	private Rectangle rectangle4;
	
	/**
	 * Sets values to be used in test, before the tests.
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Before
	public void setUp() {
		rectangle1 = new Rectangle(3,7);
		rectangle2 = new Rectangle(0,4);
		rectangle3 = new Rectangle(6,0);
		thrown.expect(AssertionError.class);
		rectangle4 = new Rectangle(-5,-4);
	}
	
	@Test
	public void testLength() {
		assertEquals(3,rectangle1.length());
		assertEquals(0,rectangle2.length());
		assertEquals(0,rectangle4.length());
		
	}
	
	@Test
	public void testWidth() {
		assertEquals(7,rectangle1.width());
		assertEquals(0,rectangle3.width());
	}
	
	@Test
	public void testArea() {
		assertEquals(21,rectangle1.area());
		assertEquals(0,rectangle2.area());
	}
	
	@Test
	public void testPerimeter() {
		assertEquals(20,rectangle1.perimeter());
		assertEquals(12,rectangle3.perimeter());
	}

	
	
	
	
	
	
	
	
	
	
	

}
