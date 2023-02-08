package org.jfree.data.test;

import static org.junit.Assert.*; import org.jfree.data.Range; import org.junit.*;

public class RangeTest 
{
	/*BeforeClass*/
    private Range exampleRange;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }

    /*Before, creates the object with some example values.*/
    @Before
    public void setUp() throws Exception { exampleRange = new Range(-100, 100); }

    /*Test, tests methods for the object, with one assert statement per stub.*/
    @Test
    public void centralValueShouldBeZero() {
        assertEquals("The central value of -1 and 1 should be 0",
        0, exampleRange.getCentralValue(), .000000001d);
    }
/*----------------------------------------------------------------------------------------------------------------------*/
    /*contains() method testing.*/
    @Test
    public void testContainLower()
    {
        assertEquals("Lower bound of -100 should be in range", true, exampleRange.contains(-100));
    }
    @Test 
    public void testContainUpper() 
    {
    	assertEquals("Upper bound 100 should be in range", true, exampleRange.contains(100));
    }
    @Test
    public void testContainBLB() 
    {
    	int BLB = -500;
    	assertEquals("Value of " + BLB + " should not be in the range", false, exampleRange.contains(BLB));
    }
    @Test
    public void testContainBUB() 
    {
    	int AUB = 1000;
    	assertEquals("Value of " + AUB + " should not be in the range", false, exampleRange.contains(AUB));
    }
    @Test
    public void testContainNom() 
    {
    	assertEquals("Value of 56 should be present in the range", true, exampleRange.contains(56));
    }
    
    /*testing combine() method*/
    

/*-----------------------------------------------------------------------------------------------------------------------*/
    
    /*After, destroys the object, Java has automatic garbage collection.*/
    @After
    public void tearDown() throws Exception {
    }

    /*AfterClass*/
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}