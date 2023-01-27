package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyJunitFourthTest {

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("before test");

	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("after test");

	}

	@Test
	public void test() {
		System.out.println("inside test");

	}
	
	@Test
	public void test1() {
		System.out.println("inside test1");

	}
	
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

}

/*
before class
before 
test
after
after class
*/