/*
 * Author name: Prashant Mokkapati
 * Class ID: CSE 360 (Monday)
 * Assignment Number: Assignment #2
 * Description: This file will test the AddingMachine class.
 */
package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {
	@Test
	public void initializeTest() {
		AddingMachine myMachine = new AddingMachine();
		
		assertEquals(myMachine.getTotal(), 0);
	}

	@Test
	public void addTest() {
		AddingMachine myMachine = new AddingMachine();
		myMachine.add(10);
		
		assertEquals(myMachine.getTotal(), 10);
	}
	
	@Test
	public void subtractTest(){
		AddingMachine myMachine = new AddingMachine();
		myMachine.add(10);
		myMachine.subtract(5);
		
		assertEquals(myMachine.getTotal(), 5);
	}
	
	@Test
	public void toStringTest(){
		AddingMachine myMachine = new AddingMachine();
		myMachine.add(10);
		myMachine.subtract(5);
		myMachine.add(2);
		
		assertEquals(myMachine.toString(), "0 + 10 - 5 + 2");
	}
	
	@Test
	public void clearTest(){
		AddingMachine myMachine = new AddingMachine();
		myMachine.add(10);
		myMachine.subtract(5);
		myMachine.add(2);
		myMachine.clear();
		
		assertEquals(myMachine.getTotal(), 0);
		assertEquals(myMachine.toString(), "0");
	}

}
