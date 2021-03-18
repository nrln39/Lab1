package exercise7;

import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] args) {
		
		CalculateWeightOnMars mars = new CalculateWeightOnMars();
		// initialize object for class CalculateWeightOnMars
		
		double weight;
		// attr. weight to store weight
		
		Scanner print = new Scanner(System.in);
		// initialize object for package scanner for display purpose
		
		
		System.out.println("Please enter your weight: (kg)"); // ask user for weight in kilograms
		weight = print.nextDouble(); // read input on console
		mars.setWeight(weight); // send value from attr. weight to method setWeight from class CalculateWeightOnMars
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("   Weight on Earth   |   Weight on Mars     ");
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println("     " + weight + "            |" + "        " + Math.round(mars.getWeight() * 100.0) / 100.0);
		// display the comparison between weight on earth and mars. weight on mars is rounded off 2 decimal place 
		System.out.println("------------------------------------------");
		
    }
}
