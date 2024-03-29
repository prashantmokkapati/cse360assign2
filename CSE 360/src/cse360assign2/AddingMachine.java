/** 	
 * @author Prashant Mokkapati
 * @class_ID CSE 360 (Monday)
 * @assignment_number Assignment #2
 * @description This file will perform calculations on a given number
 */
package cse360assign2;

/**
 * @description this class will allow the user create an instance and pass in an integer and 
 * a user can then perform calculations with that number
 */
public class AddingMachine {
	
	/**
	 * Private instance variable for the int that will be used for calculations
	 */
	private int total;
	
	/**
	 * Private instance variable for the String that will keep track of the calculations
	 */
	private String history;
	
	/**
	 * @description Method sets the private instance variables equal to zero
	 * @param no parameters
	 * @return no return value
	 */
	public AddingMachine() {
		total = 0;
		history = "0";
	}
	
	/**
	 * @description Method returns the value of the private instance variable
	 * @param no parameters
	 * @return an integer variable that is the total
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * @description Method adds the private instance variable with the value passed through the methods
	 * @param the integer value to be added
	 * @return no return value
	 */
	public void add(int value) {
		total = total + value; 
		history = history + " + " + Integer.toString(value);
	}
	
	/**
	 * @description Method subtracts the private instance variable with the value passed through the methods
	 * @param the integer value to be subtracted
	 * @return no return value
	 */
	public void subtract(int value) {
		total = total - value;
		history = history + " - " + Integer.toString(value);
	}
	
	/**
	 * @description Method turns the private instance variable to a String value
	 * @param no parameters
	 * @return returns a String of the instance variable
	 */
	public String toString() {
		return history;
	}
	
	/**
	 * @description Method clears the value of the private instance variable
	 * @param no parameters
	 * @return no return value
	 */
	public void clear() {
		this.total = 0;
		history = "0";
	} 	
}
