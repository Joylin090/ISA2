package journal_203;

import static org.junit.Assert.assertEquals;
//Joylin D'Cunha RollNo: 203


import org.junit.Test;

public class addtest {
	 @Test
	    public void testAddition() {
	        int first = 5;
	        int second = 4;
	        int expectedResult = 9;
	        int actualResult = first + second;
	        assertEquals(expectedResult, actualResult);
	    }

	    @Test
	    public void testNegativeNumbers() {
	        int first = -2;
	        int second = -7;
	        int expectedResult = -9;
	        int actualResult = first + second;
	        assertEquals(expectedResult, actualResult);
	    }
}
	
