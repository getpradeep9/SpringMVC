package com.up.uprr.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

//import junit.framework.Assert;

//import org.junit.Assert;

public class TestAccount {
	
	@BeforeClass
	public static void beforeBeforeClass(){
		System.out.println("testBeforeClass()");
	}
	
	@AfterClass
	public static void testBeforeClass(){
		System.out.println("testAfterClass()");
	}
	
	@Before
	public void testBefore(){
		System.out.println("before()");
	}
	
	@After
	public void testAfter(){
		System.out.println("after()");
	}
	
	@Test
	//@Ignore
	public void doTest(){
		System.out.println("doTest()");
	Assert.assertTrue(true);
	//Assert.assertTrue(false);
		
	}
	

	@Test
	//@Ignore
	public void doTestOne(){
		System.out.println("doTestOne()");
	Assert.assertTrue(true);
	//Assert.assertTrue(false);
		
	}

}
