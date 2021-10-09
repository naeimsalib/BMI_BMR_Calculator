/*
 * This is The runner Programe that contains the Main Method
 * 
 * Here we use this Formula to calculate the User's BMI :weight (kg) / [height (m)]2 = (kh * m^2);
 * 
 * First We need to Convert all of the User's Input to The correct Units
 * 
 */

import java.util.*;

public class Runner {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("\t\tHello There");
		System.out.print("\t\t\tPlease enter your Name : ");
		String name = sc.nextLine();
		System.out.print("\t\t\tPlease enter your height in Feet First : ");
		int heightFeet = sc.nextInt();
		System.out.print("\t\t\tPlease enter your Height in Inches : ");
		int heightInches = sc.nextInt();
		System.out.print("\t\t\tPlease enter your weight in lbs (You can use a dicimal point) : ");
		double weightLBS  = sc.nextDouble();
		System.out.print("\t\t\tPlease enter you age : ");
		int age = sc.nextInt();
		System.out.print("\t\t\tPlease enter your gender : ");
		String gender = sc.next();
		System.out.print("\t\t\tPlease enter your goalWeight : ");
		double goalWeight = sc.nextDouble();
		System.out.println();
		
		User newUser = new User(name, heightFeet, heightInches, weightLBS, age, gender, goalWeight);
		double BMI = newUser.WeightKilo() / Math.pow(newUser.HeightMeter(), 2);
		System.out.println("\t\t\tBody BMI : " + BMI + "\n");
		
		double BMR = CalculateBMR(weightLBS, newUser.HeightMeter() * 3.28084, age, gender);
		
		System.out.println("Hey " + name);
		System.out.println("You need this Amount of Calories Per day to Maintain Your weight : " + BMR);
		System.out.println("The More you eat below that Amount the faster you lose your weight");
		System.out.println("*** Reccomended amount of daily calories has To be Higher than 1000lbs ***");
		
		
	}
	
	public static double CalculateBMR(double weightLbs, double HeightFeet, int age, String gender) {
		double BMR = 0;

		if(gender.toUpperCase().equals("MALE")) {
			BMR = 66 + (6.3 * weightLbs) + (12.9 * (12 * HeightFeet)) + (6.8 * age);
		} else if(gender.toUpperCase().equals("FEMALE")) {
			BMR = 655 + (4.3 * weightLbs) + (4.7 * (12 * HeightFeet)) + (4.7 * age);
		}
		return BMR;
	}
}
