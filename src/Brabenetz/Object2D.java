package Brabenetz;
/**
 * 
 */

/**
 * @author Michael Ebenstein
 * @version 1.0
 * Proviedes functions for calculating the area of
 */
public class Object2D implements IFlaeche{
	protected double data2D[];
	
	public Object2D(double radius){
		data2D = new double[1];
		data2D[0] = radius;
	}
	
	public Object2D(double width,double length){
		data2D = new double[2];
		data2D[0] = width;
		data2D[1] = length;
	}
	
	public Object2D(double a,double b,double c){
		data2D = new double[3];
		data2D[0] = a;
		data2D[1] = b;
		data2D[2] = c;
	}
	
	@Override
	/**
	 * @see IFlaeche.java
	 */
	public double getFlaeche() {
		if(data2D.length == 1)return data2D[0]*data2D[0]*Math.PI;
		else if(data2D.length == 2)return data2D[0]*data2D[1];
		else if(data2D.length == 3){
			double s = (data2D[0]+data2D[1]+data2D[2])/2;
			return Math.sqrt(s*(s-data2D[0])*(s-data2D[1])*(s-data2D[2]));
		}
		return 0;
	}

}
