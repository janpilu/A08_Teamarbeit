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
 * 
 */
public class Numbers implements IZahlen {
	
	private LinkedList<Double> numbers;
	
	/**
	 * Constructor that initializes numbers with a new LinkedList
	 * 
	 */
	public Numbers() {
		this.numbers = new LinkedList<Double>();
	}

	/**
	 * @see IZahlen
	 * 
	 * @throws NullPointerException if the collection is null
	 */
	public double getSumme() throws NullPointerException {
		if (numbers == null || numbers.size() == 0) throw new NullPointerException();
		Iterator<Double> it = numbers.iterator();
		
		double returnValue = 0.0;
		
		while (it.hasNext()) {
			returnValue += it.next();
		}
		
		return returnValue;
	}

	/**
	 * @see IZahlen
	 * 
	 * @throws NullPointerException if the list is null or it is empty
	 */
	public double getMinimum() throws NullPointerException {
		if (numbers == null || numbers.size() == 0)
			throw new NullPointerException();
		
		Object[] helpArray = numbers.toArray();
		Arrays.sort(helpArray);
		
		return (double) helpArray[0];
	}

	/**
	 * @see IZahlen
	 * 
	 * @throws NullPointerException if the list is null or it is empty
	 */
	public double getMaximum() throws NullPointerException {
		if (numbers == null || numbers.size() == 0)
			throw new NullPointerException();
		
		Object[] helpArray = numbers.toArray();
		Arrays.sort(helpArray);
		
		return (double) helpArray[helpArray.length-1];
	}

	/**
	 * @see IZahlen
	 * 
	 * @throws NullPointerException if the collection is null
	 */
	public void add(double value) throws NullPointerException {
		if (numbers == null) throw new NullPointerException();
		this.numbers.add(value);
	}
	
}
