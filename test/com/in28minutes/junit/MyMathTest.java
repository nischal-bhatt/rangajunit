package com.in28minutes.junit;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//with junit u can do automation testing
class MyMathTest {

	MyMath myMath;
	
	@BeforeEach
	public void before()
	{
		myMath = new MyMath();
		System.out.println("before");
	}
	
	@Test
	void test() {
		//fail("Not yet implemented");
		//absence of failure is success
	}
	
	@Test
	public void sum_with3numbers()
	{
		System.out.println("test");
		int result=myMath.sum(new int[] {1,2,3});
		//System.out.println(myMath.sum(new int[] {1,2,3}));
		//check that the result is 6
		
		assertEquals(6,result);
		
	}
	
	
	@Test
	public void sum_with1number()
	{
		
		int result=myMath.sum(new int[] {2});
		//System.out.println(myMath.sum(new int[] {1,2,3}));
		//check that the result is 6
		
		assertEquals(2,result);
		
	}
	
	@AfterEach
	public  void after()
	{
		System.out.println("after");
	}
	
	@AfterAll
	public static void afterClass()
	{
		System.out.println("after class");
	}
	
	@BeforeAll
	public static void beforeClass()
	{
		System.out.println("before class");
	}

}
