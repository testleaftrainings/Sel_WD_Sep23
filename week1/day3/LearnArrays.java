package week1.day3;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		/*
		 * Arrays -> used to store a collection of elements
		 * Data type must be same
		 * To access the elements present in the array - use index
		 * Index starts from 0
		 * Length starts from 1
		 * Arrays.length - count of the array elements
		 * Here, length is a property
		 * 
		 * 
		 */
		
		//To define array -> 1. Array Literal 2. Instantiation
		
		//When you know the values in an array
		//datatype[]  varName = {set of known values};
		
		int[] a  = {5,10,15};
		String[] mentors = {"Dilip", "Gokul", "Subraja", "Vineeth"};
		System.out.println(mentors[0] + ","+ mentors[2]);
		System.out.println(mentors[1]);
		System.out.println(mentors[2]);
		System.out.println(mentors[3]);
		//count of the array -> Array size
		int length = mentors.length;  //To store it as a local variable -ctrl+2,L
		System.out.println(length);
			
		//Using Instantiation
		 String trainers[] = new String[7];
		 trainers[0] = "Babu";
		 trainers[1] = "Hari";
		 trainers[2] = "Vidya";
		 trainers[3] = "Princilla";
		 trainers[4] = "Subraja";
		 trainers[5] = "Dilip";
		 trainers[6] = "SSP";
		 
		 System.out.println(trainers.length);
		 System.out.println("******************");
		 //datatype[] arrayName ={values}
		 int[] scores = {98, 99, 85, 91, 83, 76, 80, 75, 100};
		 	//index       0,  1,  2,  3,  4,  5,  6,  7,  8
		 	//length      1,  2,  3,  4,  5,  6,  7,  8,  9
		 
		 
		 //ArrayIndexOutofBoundException - Index 9 out of bounds for length 9 -> length-1
		 
		 //method to sort the array values
		 Arrays.sort(scores);
		 int lengthOfArray = scores.length;
		 for (int i = 0; i < scores.length; i++) {
			 
			 System.out.println(scores[i]);
			
		}
		 System.out.println("**********************");
		 System.out.println(lengthOfArray);
		for (int i = lengthOfArray-1 ; i >= 0; i--) {
			 // i = 9-1
			System.out.println(scores[i]);
			
		}		
		

	}

}
