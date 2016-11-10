package Brabenetz;

/**
 * Interface that provides various method to deal with numbers
 * 
 * @author Peter Fuchs
 * @version 2016-11-10
 *
 */
public interface IZahlen {
	
	/**
	 * Returns the sum of the collection
	 * 
	 * @return sum of the collection
	 * 
	 */
	public double getSumme();
	
	/**
	 * Returns the minimum value of the collection
	 * 
	 * @return minimum of the collection
	 */
	public double getMinimum();
	
	/**
	 * Returns the maximum value of the collection
	 * 
	 * @return maximum of the collection
	 */
	public double getMaximum();
	
	/**
	 * Adds a double to the collection
	 * 
	 * @param value the number that gets added
	 */
	public void add(double value);
}
