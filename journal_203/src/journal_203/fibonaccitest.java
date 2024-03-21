package journal_203;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class fibonaccitest {
	//Joylin D'Cunha RollNo: 203

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	

	    @Test
	    public void testFibonacciSeries() {
	        int n = 10;
	        int[] expectedResult = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
	        int[] actualResult = fibonacci.generateFibonacciSeries(n);
	        assertArrayEquals(expectedResult, actualResult);
	    }
	    @Test
	    public void testFibonacciSeriesWithZeroTerms() {
	        int n = 0;
	        int[] expectedResult = {};
	        int[] actualResult = fibonacci.generateFibonacciSeries(n);
	        assertArrayEquals(expectedResult, actualResult);
	    }
	    

	

}
