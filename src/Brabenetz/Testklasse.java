package Brabenetz;


/**
 * Class to test Object2D.java, Object3D.java and Number.java
 * 
 * @author Oskar Koiner
 * @version 2016-11-11
 *
 */
public class Testklasse {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String error_msg= "";
		
		//test if constructors do the same
		System.out.println("Test 1(constructors+getFlaeche()):");
		for(int i = 0; i < 1000; ++i){
			double a = Math.random()*2;
			double b = Math.random()*2;
			double c = Math.random()*2;
			double d = Math.abs(a-b) + (Math.random() * ((Math.abs(a+b) - Math.abs(a-b))));//(a+b)*(Math.random());
			
			if((new Object3D(a,b).getRaumInhalt() - new Object3D(new Object2D(a),b).getRaumInhalt()) != 0.0){
				error_msg = "Object3D(a,b) != Object3D(Object2D(a),b)";
				error_msg += ("For: a="+a+" b="+b+"\n");
				error_msg += ("Object3D(a,b) -> "+new Object3D(a,b).getRaumInhalt()+"   Object3D(Object2D(a),b) -> "+new Object3D(new Object2D(a),b).getRaumInhalt());
				break;
			}
			if(0.0!= (new Object3D(a,b,c).getRaumInhalt() - new Object3D(new Object2D(a,b),c).getRaumInhalt()) ){
				error_msg = "Object3D(a,b,c) != Object3D(Object2D(a,b),c)";
				error_msg += ("For: a="+a+" b="+b+" c="+c+"\n");
				error_msg += ("Object3D(a,b,c) -> "+new Object3D(a,b,c).getRaumInhalt()+"   Object3D(Object2D(a,b),c) -> "+new Object3D(new Object2D(a,b),c).getRaumInhalt());
				break;
			}
			try{
				if(0.0!=  (new Object3D(a,b,d,c).getRaumInhalt() - new Object3D(new Object2D(a,b,d),c).getRaumInhalt()) ){
					error_msg = "Object3D(a,b,c,d) != Object3D(Object2D(a,b,c),d)\n";
					error_msg += ("For: a="+a+" b="+b+" c="+d+" d="+c+"\n");
					error_msg += ("Object3D(a,b,c,d) -> "+new Object3D(a,b,d,c).getRaumInhalt()+"   Object3D(Object2D(a,b,c),d) -> "+new Object3D(new Object2D(a,b,d),c).getRaumInhalt());
					break;
				}
			}
			catch(Exception e){
				error_msg = "Exception "+e.getMessage()+" For a="+a+" b="+b+" c="+d;
				break;
			}
			error_msg = "successful";
			
		}
		System.out.println("\t"+error_msg);

		//Test Exceptions
		error_msg = "failed";
		System.out.println("Test 2 (exceptions):");

		double a = 3, b = 2.123;
		Object2D o2d;
		try{
			o2d = new Object2D(a,b,a+b+0.001);
		}
		catch(Exception e){
			try{
				o2d = new Object2D(a,b,a+b);
			}
			catch(Exception e1){
				error_msg = "successful";
			}
		}
		System.out.println("\t"+error_msg);
		/*
		
		
		error_msg = "successful";
		System.out.println("Test 3:");
		Numbers num = new Numbers();
		try{
			num.getSumme();
		}catch(Exception e){
			
		}
		num.getMinimum();
		num.getMaximum();
		System.out.println("\t"+error_msg);
		*/

	}

}
