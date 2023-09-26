package week1.day3;

public class Bicycle {
	
	/*
	 * Variables - information about the cycle
	 * brandName
	 * color
	 * countOfCycle
	 * cycleModel
	 * rateOfCycle
	 * 
	 * 
	 * Method - action or a function
	 * speedOfCycle
	 * gearMode
	 * 
	 *methodName - camelCase
	 *method signature - AccessModifier returnType methodName(){
	 *
	 *			statements;
	 *   }
	 * Methods can have arguments or it may not have arguments
	 * 		-without arguments -> methodName()
	 * 		- with arguments -> methodName(String brandName, String cycleModel, int countOfCycles))
	 * 
	 * 
	 */
	//AccessModifier   Return Type		methodName
	          void          speedOfCycle() {
		
		System.out.println("10km/hr");
		
	}
	    
	     void gearMode() {
	    	
	    	System.out.println("Yes, it is a gear mode cycle");
	    }
	
	    public static void main(String[] args) {
			
	    	//How to define an object - reference to your Class
	    	//objectName - camelCase - user defined
	    	//ClassName  objectName = new ClassName();
	    	
	    	System.out.println("This class is about the Bicycle");
	    	Bicycle cycle = new Bicycle();
	    	cycle.gearMode();
	    	cycle.speedOfCycle();  	
	    	
	    	
	    	
	    	
		}
	
	

}
