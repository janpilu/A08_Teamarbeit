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
		System.out.println("Test 1:");
		for(int i = 0; i < 1000; ++i){
			double a = Math.random()*2-1;
			double b = Math.random()*2-1;
			double c = Math.random()*2-1;
			double d = a+b+(Math.random()*2-1);
			
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
			if(0.0!=  (new Object3D(a,b,d,c).getRaumInhalt() - new Object3D(new Object2D(a,b,d),c).getRaumInhalt()) ){
				error_msg = "Object3D(a,b,c,d) != Object3D(Object2D(a,b,c),d)\n";
				error_msg += ("For: a="+a+" b="+b+" c="+d+" d="+c+"\n");
				error_msg += ("Object3D(a,b,c,d) -> "+new Object3D(a,b,d,c).getRaumInhalt()+"   Object3D(Object2D(a,b,c),d) -> "+new Object3D(new Object2D(a,b,d),c).getRaumInhalt());
				break;
			}
			error_msg = "successful";
			
		}
		System.out.println("\t"+error_msg);
		

	}

}
