package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


//Create annotation
@RunWith(Parameterized.class)

public class JunitParameterised 
{
    //Variables
	public String name;
    public int age;
    
    //create a constructor
    public JunitParameterised(String name,int age)
    {
    	//this. is assigned with the parameters passed from the main code
    	//for name and age
    	this.name = name;
    	this.age = age;
    }
    

	@Test
	public void test() 
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);

	}

	@Parameters
	public static Collection<Object[]> parameter()
	{
		Object [][] data = new Object[2][2];
		
		data[0][0] = "Aparna";
		data[0][1] = 10;
		
		data[1][0]= "Vasu";
		data[1][1] = 20;
		
		//return the values declared above
		return Arrays.asList(data);
	}
	
}
