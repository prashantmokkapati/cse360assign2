/*
 * Author name: Prashant Mokkapati
 * Class ID: CSE 360 (Monday)
 * Assignment Number: Assignment #2
 * Description: This file will test the AddingMachine class.
 */
package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//A series of methods will test whether the methods of AddingMachine are properly being implemented
class AddingMachineTest {
	
	//Tests if AddingMachine initializes correctly
	@Test
	public void initializeTest() {
		AddingMachine myMachine = new AddingMachine();
		
		assertEquals(myMachine.getTotal(), 0);
	}

	//Tests if addition happens correctly in AddingMachine
	@Test
	public void addTest() {
		AddingMachine myMachine = new AddingMachine();
		myMachine.add(10);
		
		assertEquals(myMachine.getTotal(), 10);
	}
	
	//Tests if subtraction happens correctly in AddingMachine
	@Test
	public void subtractTest(){
		AddingMachine myMachine = new AddingMachine();
		myMachine.add(10);
		myMachine.subtract(5);
		
		assertEquals(myMachine.getTotal(), 5);
	}
	
	//Tests if the history of the chances made correctly gets tracked in AddingMachine
	@Test
	public void toStringTest(){
		AddingMachine myMachine = new AddingMachine();
		myMachine.add(10);
		myMachine.subtract(5);
		myMachine.add(2);
		
		assertEquals(myMachine.toString(), "0 + 10 - 5 + 2");
	}
	
	//Tests if AddingMethod correctly clears the operations previously done
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
