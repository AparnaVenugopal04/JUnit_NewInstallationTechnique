package com.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyThirdJunit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("before class");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("after class");

	}

	@Test
	public void test() {
		System.out.println("inside test");
	}
	
	@Test
	public void test1()
	{
		System.out.println("inside test1");
	}

}
