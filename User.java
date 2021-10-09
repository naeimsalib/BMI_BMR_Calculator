/*
 * User.Java 
 * a user Class to take in all of the User's information and save them in a  User Object
 */
public class User {
	private String name;
	private int heightFeet;
	private int heightInches;
	private double weightLbs;
	private int age;
	private String gender;
	private double goalWeight;
	
	//Default Constructor
	public User() {
		
	}
	
	//Constructor with Parameters
	public User(
	 String name,
	 int heightFeet,
	 int heightInches,
	 double weightLbs,
	 int age,
	 String gender,
	 double goalWeight){
		this.name = name;
		this.heightFeet = heightFeet;
		this.heightInches = heightInches;
		this.weightLbs = weightLbs;
		this.age = age;
		this.gender = gender;
		this.goalWeight = goalWeight;
	}
	
	//Getters
	public String getName() {
		return this.name;
	}
	
	public int getHeightFeet() {
		return this.heightFeet;
	}
	
	public int getHeightInches() {
		return this.heightInches;
	}
	
	public double getWeightLBS() {
		return this.weightLbs;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public double getGoalWeight() {
		return this.goalWeight;
	}
	
	
	//Setters
	public void setName(String UName) {
		 this.name = UName;
	}
	
	public void setHeightFeet(int UHeight) {
		 this.heightFeet = UHeight;
	}
	
	public void setHeightInches(int UHeightInches) {
		 this.heightInches = UHeightInches;
	}
	
	public void setWeightLBS(double UWieght) {
		 this.weightLbs = UWieght;
	}
	
	public void setAge(int UAge) {
		 this.age = UAge;
	}
	
	public void setGender(String UGender) {
		 this.gender = UGender;
	}
	
	public void setGoalWeight(double UGoalWeight) {
		 this.goalWeight = UGoalWeight;
	}
	
	//Other Methods
	
	// return User's Height in meters
	public double HeightMeter() {
		double feet = this.heightFeet + (this.heightInches * 0.0833333); 
		double meters = feet * 0.3048;
		double roundOff = (double) Math.round(meters * 100) / 100;
		return roundOff;
	}
	
	//Return User's Weight in Kilos from LBS
	public double WeightKilo() {
		double kilo = this.weightLbs * 0.453592;
		double roundOff = (double) Math.round(kilo * 100) / 100;
		return roundOff;
	}
	
	//Return User's Goal Weight in Kilos from Lbs
	public double GoalWeightKilo() {
		double goalKilo = this.goalWeight * 0.453592;
		double roundOff = (double) Math.round(goalKilo) / 100;
		return roundOff;
	}
	
}
