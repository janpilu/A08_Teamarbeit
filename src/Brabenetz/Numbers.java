package Brabenetz;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * This Object has a double-Collection and can return<br>
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
		Iterator<Double> it = numbers.iterator();
		
		double returnValue = 0.0;
		
		while (it.hasNext()) {
			returnValue += it.next();
		}
		
		return returnValue;
	}

	/**
	 * @return the minimum number of the collection
	 * @throws NullPointerException
	 */
	public double getMinimum() {
		if (numbers == null || numbers.size() == 0)
			throw new NullPointerException();
		
		Object[] helpArray = numbers.toArray();
		Arrays.sort(helpArray);
		
		return (double) helpArray[0];
	}

	/**
	 * @return the maximum number of the collection
	 */
	public double getMaximum() {
		if (numbers == null || numbers.size() == 0)
			throw new NullPointerException();
		
		Object[] helpArray = numbers.toArray();
		Arrays.sort(helpArray);
		
		return (double) helpArray[helpArray.length-1];
	}

	/**
	 * Adds a number to the collection
	 * 
	 * @param value the value to be added
	 */
	public void add(double value) {
		this.numbers.add(value);
	}
	
}
