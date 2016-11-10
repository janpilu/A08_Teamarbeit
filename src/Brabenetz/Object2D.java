package Brabenetz;
/**
 * 
 */

/**
 * @author Michael Ebenstein
 * @version 1.0
 *
 */
public class Object2D implements IFlaeche{
	private double data[];
	
	public Object2D(double radius){
		data = new double[1];
		data[0] = radius;
	}
	
	public Object2D(double width,double height){
		data = new double[2];
		data[0] = width;
		data[1] = height;
	}
	
	public Object2D(double a,double b,double c){
		data = new double[3];
		data[0] = a;
		data[1] = b;
		data[2] = c;
	}
	
	@Override
	public double getFlaeche() {
		// TODO Auto-generated method stub
		return 0;
	}

}
