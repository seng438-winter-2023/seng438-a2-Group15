package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D;
import org.jmock.*;
import org.junit.*;
import java.util.*;

public class DataUtilitiesTest
{
	@BeforeClass public static void setUpBeforeClass() throws Exception {
    }
	
	/*Mocking the interfaces*/
	static Values2D values;
	static KeyedValues kv;
	static Mockery mockO;
	
	@Before
	public void setUp() throws Exception 
	{
		mockO = new Mockery();
		values = mockO.mock(Values2D.class);
		kv = mockO.mock(KeyedValues.class);
	}
	/*--------------------------------------------------------------------------------------------------------------------------*/
	@Test
	public void testColumnSumValid() 
	{
	    // setup
	    mockO.checking(new Expectations() {
	        {
	            one(values).getRowCount();
	            will(returnValue(2));
	            one(values).getValue(0, 0);
	            will(returnValue(7.5));
	            one(values).getValue(1, 0);
	            will(returnValue(2.5));
	        }
	    });
	    double result = DataUtilities.calculateColumnTotal(values, 0);
	    // verify
	    assertEquals(result, 10.0, .000000001d);
	    // tear-down: NONE in this test method
	}
	@Test
	public void testColumnSumInvalid() 
	{
	    // setup
	    mockO.checking(new Expectations() {
	        {
	            one(values).getRowCount();
	            will(returnValue(2));
	            one(values).getValue(0, 0);
	            will(returnValue(7.5));
	            one(values).getValue(1, 0);
	            will(returnValue(2.5));
	        }
	    });
	    double result = DataUtilities.calculateColumnTotal(values, 0);
	    // verify
	    assertNotSame("The sum was correct ", 12.0, result);
	    // tear-down: NONE in this test method
	}
	/**---------------- TESTING ROW CALCULATION ------------------------------------------------------**/
	@Test
	public void testRowSum() /**DEFECTIVE**/
	{
		mockO.checking(new Expectations() 
		{
			
			{
				one(values).getColumnCount();
				will(returnValue(3));
				one(values).getValue(0, 0);
				will(returnValue(4.5));
				one(values).getValue(0, 1);
				will(returnValue(7.8));
				one(values).getValue(0, 2);
				will(returnValue(10.123));
			}
		});
		double rowSum = DataUtilities.calculateRowTotal(values, 0);
		assertEquals("Sum is not correct ", 22.423, rowSum, .00000001d);
	}
	/**------------------ TESTING createNumberArray(double[] data) -------------------------------------**/
	@Test
	public void testCreateNumArrayExists() 
	{
		double[] data = {1.0, 4.5, 12.3456, 7.890};
		Number[] numsData = DataUtilities.createNumberArray(data);
		List<Number> numsArr = Arrays.asList(numsData);
		assertEquals("Value was not found ", true, numsArr.contains(12.3456));
	}
	@Test
	public void testCreateNumArrayNotExists() 
	{
		double[] data = {1.0, 4.5, 12.3456, 7.890};
		Number[] numsData = DataUtilities.createNumberArray(data);
		List<Number> numsArr = Arrays.asList(numsData);
		assertEquals("Value was found ", false, numsArr.contains(1));
	}
	/**------------------ TESTING createNumberArray2D(double[][] data) -------------------------------------**/
	@Test
	public void testCreateNumArray2DExists() /**DEFECTIVE**/
	{
		double[][] data = {{1.0, 2.01}, {5.60, 7.1234}, {1.11, 8.90}};
		Number[][] numsData = DataUtilities.createNumberArray2D(data);
		assertEquals("Value was not found ", 7.1234, numsData[0][1]);
	}
	@Test
	public void testCreateNumArray2DNotExists() /**DEFECTIVE**/
	{
		double[][] data = {{1.0, 2.01}, {5.60, 7.1234}, {1.11, 8.90}};
		Number[][] numsData = DataUtilities.createNumberArray2D(data);
		assertEquals("Value was not found ", false, numsData[0][0].equals(3.0));
	}
	/**------------------ TESTING getCulmulativePercentages -------------------------------------**/
	
	
	/*--------------------------------------------------------------------------------------------------------------------------*/
    /*After, destroys the object, Java has automatic garbage collection.*/
    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}