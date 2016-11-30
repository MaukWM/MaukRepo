package ss.week2;

public class Rectangle {
    private int length;
    private int width;

    //@ private invariant length >= 0;
    //@ private invariant width >= 0 ;
    /**
     * Create a new Rectangle with the specified length and width.
     */
    /*@
        requires theLength >= 0;
        requires theWidth >= 0;
        ensures length() == theLength;
        ensures width() == theWidth;
     */
    public Rectangle(int theLength, int theWidth) {
    	assert theLength >= 0;
    	assert theWidth >= 0;
    	length = theLength;
    	width = theWidth;
    }
    
    /**
     * The length of this Rectangle.
     */
    //@ ensures \result >= 0;
    /*@ pure */ public int length() {
    	assert length >= 0;
    	return length;
    }

    /**
     * The width of this Rectangle.
     */
    //@ ensures \result >= 0;
    //@ pure
    public int width() {
    	assert width >= 0;
    	return width;
    }
    
    //@ ensures \result >= 0;
    //@ ensures \result == length() * width();
    /**
     * The area of this Rectangle.
     */
    public int area() {
    	int area;
    	area = width * length;
    	assert area >= 0;
    	assert area == width * length;
    	return area;
    }

    /**
     * The perimeter of this Rectangle.
     */
    //@ ensures \result >= 0;
    //@ ensures \result == 2*width() + 2*length();
    public int perimeter() {
    	int perimeter;
    	perimeter = 2*width +2*length;
    	assert perimeter >= 0;
    	assert perimeter == 2*width() + 2*length();
    	return perimeter;
    }
}
