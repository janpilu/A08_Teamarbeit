package Brabenetz;

public interface IZahlen {
	/**
	 * @return the sum of the collection
	 */
	public double getSumme();
	/**
	 * @return the minimum of the collection
	 */
	public double getMinimum();
	/**
	 * @return the maximum of the collection
	 */
	public double getMaximum();
	/**
	 * adds a double to the collection
	 * 
	 * @param value the number that gets added
	 */
	public void add(double value);
}
