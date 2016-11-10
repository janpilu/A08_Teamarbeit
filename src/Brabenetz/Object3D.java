package Brabenetz;

/**
 * Class to create a 3D-object and get the volume of it
 * 
 * @author Alexander Strasser
 * @version 2016-11-10
 *
 */
public class Object3D extends Object2D implements IRaumInhalt {
	private double height;
	
	/**
	 * Constructor for cylinders
	 * 
	 * @param radius radius of the cylinder
	 * @param height height of the cylinder
	 */
	public Object3D(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	/**
	 * Constructor for cuboids
	 * 
	 * @param length length of the cuboid
	 * @param width width of the cuboid
	 * @param height height of the cuboid
	 */
	public Object3D(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}
	
	/**
	 * Constructor for prisms with a triangle as base
	 * 
	 * @param a first side of the base area
	 * @param b second side of the base area
	 * @param c third side of the base area
	 * @param height height of the prism
	 */
	public Object3D(double a, double b, double c, double height) {
		super(a, b, c);
		this.height = height;
	}
	
	/**
	 * Constructor for a prism with a circle, a triangle or a rectangle
	 * 
	 * @param object2D the base area as Object2D object
	 * @param height height of the prism
	 */
	public Object3D(Object2D object2D, double height) {
		super(object2D);
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
