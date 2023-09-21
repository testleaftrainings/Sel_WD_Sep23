package week1.day2;

public class LearnIfStatement {

	public static void main(String[] args) {
		
		int number = -89 ;
		
		if(number>0) {
			
			System.out.println(number + " "+ "The given number is positive");

			
		} else if(number<0) {
			
			System.out.println(number +  " "+"The given number is negative");
			
		}else
			
			System.out.println(number+ " "+ "The number is neutral");
			
	}

}
