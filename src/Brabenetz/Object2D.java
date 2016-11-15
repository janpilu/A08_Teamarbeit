package Brabenetz;

/**
 * Provides functions for calculating the area of circles, rectangles and triangles
 * 
 * @author Michael Ebenstein
 * @version 2016-11-10
 * 
 */

import javax.management.InvalidAttributeValueException;

public class Object2D implements IFlaeche{
	protected double data2D[];
	
	/**
	 * Constructor for a circle
	 * 
	 * @param radius of the circle
	 * 
	 */
	public Object2D(double radius){
		data2D = new double[1];
		data2D[0] = radius;
	}
	
	/**
	 * Constructor for rectangles
	 * 
	 * @param width of the rectangle
	 * @param length of the rectangle
	 */
	public Object2D(double width,double length){
		data2D = new double[2];
		data2D[0] = width;
		data2D[1] = length;
	}
	
	/**
	 * Constructor for triangles
	 * @param a side
	 * @param b side
	 * @param c side
	 * @throws InvalidAttributeValueException 
	 */
	public Object2D(double a,double b,double c) throws InvalidAttributeValueException{
		if(!((a+b)>c && (a+c)>b && (b+c)>a)){
			throw new InvalidAttributeValueException();
		}
		data2D = new double[3];
		data2D[0] = a;
		data2D[1] = b;
		data2D[2] = c;
	}
	
	/**
	 * Constructor for Object2D
	 * @param obj Object2D
	 */
	public Object2D(Object2D obj){
		data2D = obj.data2D;
	}
	
	
	@Override
	/**
	 * @see IFlaeche.java
	 * 
	 */
	public double getFlaeche() {
		if(data2D.length == 1)return data2D[0]*data2D[0]*Math.PI;
		else if(data2D.length == 2)return data2D[0]*data2D[1];
		else if(data2D.length == 3){
			double s = (data2D[0]+data2D[1]+data2D[2])/2;
			double res = s*(s-data2D[0])*(s-data2D[1])*(s-data2D[2]);
			return Math.sqrt(res);
		}
		return 0;
	}
}
