package exercise7;

import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] args) {
		
		CalculateWeightOnMars mars = new CalculateWeightOnMars();
		double weight;
		Scanner print = new Scanner(System.in);
		
		
		System.out.println("Please enter your weight: (kg)");
		weight = print.nextDouble();
		mars.setWeight(weight);
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("   Weight on Earth   |   Weight on Mars     ");
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println("     " + weight + "       |" + "        " + mars.getWeight());
		
		System.out.println("------------------------------------------");
		
    }
}
