package com.revature.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;


import com.revature.beans.States;



public class StateTest {
	static States a= new States("Texas", "Austin",10000000);
	static States b=new States("Colorado", "Denver",500000);
	
	
	 @BeforeClass
	public static void loadStates() {
		int population =Mockito.mock(int.class);
				a= new States("a","Austin",population);
				System.out.println("Loaded States...");
			System.out.println(a.toString());
		}			

	@Test
	public void addPopultion() {
		Mockito.when(a.getStateProperties().addPopulation()).thenReturn(10);
		int NewPop= a.getPopulation()+b.getPopulation();
		assertEquals(NewPop,10500000);
		
	}
}
