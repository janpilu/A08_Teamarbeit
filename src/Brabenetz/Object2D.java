package Brabenetz;

/**
 * Provides functions for calculating the area of circles, rectangles and triangles
 * 
 * @author Michael Ebenstein
 * @version 2016-11-10
 * 
 */
public class Object2D implements IFlaeche{
	protected double data2D[];
	
	/**
	 * Constructor for a circle
	 * 
	 * @param radius of the circle
	 * @throws IllegalArgumentException if radius < 0
	 */
	public Object2D(double radius) throws IllegalArgumentException {
		data2D = new double[1];
		if((data2D[0] = radius) < 0)
			throw new IllegalArgumentException();
	}
	
	/**
	 * Constructor for rectangles
	 * 
	 * @param width of the rectangle
	 * @param length of the rectangle
	 * @throws IllegalArgumentException if width or length < 0
	 */
	public Object2D(double width,double length) throws IllegalArgumentException {
		data2D = new double[2];
		if((data2D[0] = width) < 0 ||(data2D[1] = length) < 0)
			throw new IllegalArgumentException();
	}
	
	/**
	 * Constructor for triangles
	 * @param a side
	 * @param b side
	 * @param c side
	 * @throws IllegalArgumentException if a, b and c cant form a rectangle or one is negative
	 */
	public Object2D(double a,double b,double c) throws IllegalArgumentException{
		if(!((a+b)>c && (a+c)>b && (b+c)>a) || a < 0 || b < 0 || c < 0)
			throw new IllegalArgumentException();
		
		data2D = new double[3];
		data2D[0] = a;
		data2D[1] = b;
		data2D[2] = c;
	}
	
	/**
	 * Constructor for Object2D
	 * @param obj Object2D
	 */
	public Object2D(Object2D obj) {
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
