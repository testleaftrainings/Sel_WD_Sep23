package week1.day3;

public class LearnReturnType {
	
	//void - the doesn't return anything when it is called
	
	public void cycleCount() {
		
		System.out.println("No. of cycles is 2");
	}
	
	//primitive datatypes - int, boolean,char, float, long, double
	
	public int gearMode() {
		
		return 2;
	}
	
	public boolean batteryEnabled(boolean battery) {
		
		return battery;
	}
	
	//Non-primitive datatype -String
	public String brandName() {
		
		return "bsa";

	}
	
	public String cycleDetails(String cycleColor, String cycleModel) {
		
		return cycleColor+ " " + cycleModel;
	}
	
	public float addNum(float a, float b, int c) {
		
		return a+b;
	}
	
	public static void main(String[] args) {
		
		LearnReturnType returnObj = new LearnReturnType();
		returnObj.cycleCount();
		System.out.println(returnObj.gearMode());
		System.out.println(returnObj.batteryEnabled(true));
		System.out.println(returnObj.brandName());
		System.out.println(returnObj.cycleDetails("blue", "BSA101"));
		System.out.println(returnObj.addNum(24.3f, 56.7f, 10));
		
	}
	
}
