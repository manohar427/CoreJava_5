package com.test;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculatorTest extends TestCase {

	
    public CalculatorTest( String testName )
    {
        super( testName );
    }

    
    public static Test suite()
    {
        return new TestSuite( CalculatorTest.class );
    }

    
    public void testCalcAdd()
    {
    	Calculator c = new Calculator();
		Assert.assertEquals(c.add(12, 11), 23);
    }
    
    public void testCalcSub()
    {
    	Calculator c = new Calculator();
		Assert.assertEquals(c.sub(12, 11), 1);
    }
    
    public void testCalcAddWrong()
    {
    	Calculator c = new Calculator();
		Assert.assertEquals(c.add(12, 11), 23);
    }
    
    
    public void testCalcAddNeg()
    {
    	Calculator c = new Calculator();
		Assert.assertEquals(c.add(-12, 11), -1);
    }
    
    public void testCalcAddTwoNeg()
    {
    	Calculator c = new Calculator();
		Assert.assertEquals(c.add(-12, -11), -23);
    }
    
    public void testCalcAddBig()
    {
    	Calculator c = new Calculator();
		Assert.assertEquals(c.add(1200, 1100), 2300);
    }
    
    
    
}
