package com.aiventu.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SMSModuleTest {
    SMSModule sm = new SMSModule();
    
    @BeforeClass
    public static void setUpBeforeClass(){
    System.out.println("Before Class");	
    }
    
    @AfterClass
    public static void tearDownAfterClass(){
    System.out.println("After Class");
    }
    
    
    @Before
    public void setUp(){
    	System.out.println("before");
    }
    @After
    public void tearDown(){
    	System.out.println("after");
    }
    
	public SMSModuleTest() {
	}


//    @Ignore // un 
	@Test
	public void testGetVersion() {
//		int x = (10 / 0);  C'est une erreur ce n'est pas un failure
		System.out.println("test Get Version");
		String result = sm.getVersion();
		assertEquals("1.0", result);
	}
	
	
	/*
	 * Msg DE Junit pour verifier si la methode send retourne une exception
	 * de type IllegalArgumentException
	 * Sinon ca sera un fail
	 * 
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testSend(){
		System.out.println("test send");
		sm.send(null);
		
	}
	
	

}
