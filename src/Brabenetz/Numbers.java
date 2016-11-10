package Brabenetz;

import java.util.LinkedList;

/**
 * This Object principally has a double-Collection and can return<br>
 * the largest number, the smallest number and the sum of all the numbers in the collection.<br>
 * 
 * @author Peter Fuchs
 * @version 2016-11-10
 */
public class Numbers implements IZahlen {
	
	private LinkedList<Double> numbers;
	
	/**
	 * Constructor
	 */
	public Numbers() {
		this.numbers = new LinkedList<Double>();
	}

	/**
	 * @return the sum of the numbers in the collection
	 */
	public double getSumme() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the minimum number of the collection
	 */
	public double getMinimum() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the maximum number of the collection
	 */
	public double getMaximum() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Adds a number to the collection
	 * 
	 * @param value the value to be added
	 */
	public void add(double value) {
		
	}
	
}
