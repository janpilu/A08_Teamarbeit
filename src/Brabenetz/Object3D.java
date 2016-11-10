package Brabenetz;

public class Object3D extends Object2D implements IRaumInhalt {
	private double height;
	
	public Object3D(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Object3D(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}
	
	public Object3D(double a, double b, double c, double height) {
		super(a, b, c);
		this.height = height;
	}
	
	/**
	 * @see IRaumInhalt
	 * 
	 */
	@Override
	public double getRaumInhalt() {		
		return getFlaeche() * height;
	}

}
