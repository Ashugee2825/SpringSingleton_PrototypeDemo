package com.telusko.SpringSingletonandPrototypeDemo;

import static org.junit.Assert.assertTrue;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Test;


public class AppTest 
extends TestCase
{
/**
 * Create the test case
 *
 * @param testName name of the test case
 */
public AppTest( String testName )
{
    super( testName );
}

/**
 * @return the suite of tests being tested
 */
public static TestSuite suite()
{
    return new TestSuite( AppTest.class );
}

/**
 * Rigourous Test :-)
 */
public void testApp()
{
    assertTrue( true );
}
}

