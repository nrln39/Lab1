package exercise8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  //import all packages needed

import exercise7.CalculateWeightOnMars;  //import package exercise 7

public class Human {
	
	private String name; //holds value name for object type human
	
	private String getName() //getter to send name of a current object
	{
		return name;
	}
	
	private void setName(String name)// setter is used to set the received value as name
	{
		this.name = name; // assign the value to local attribute
	}
	
	
	public static void main(String[] args) {
		List<String> ListHuman =new ArrayList<String>(); //initialize list to store few strings in order
		
		String name; // attr. to hold value name
		double weight; // attr. to hold value weight
		
		CalculateWeightOnMars mars = new CalculateWeightOnMars();
		// initialize object for class CalculateWeightOnMars
		
		Human human = new Human();
		
		Scanner print = new Scanner(System.in);
		// initialize object for package scanner for display purpose
		
		int choice = 0; // initializa attr. to hold user's choice
		int counter = 0; // initialize a counter to keep track on how many humans are listed
		
		do //loop
		{
			counter++; // plus 1 everytime loop goes on iteration
			
			System.out.println("\n===============  Person " + counter + "  ===============");
			
			System.out.println("\nPlease enter your name: "); // ask user for name
			name = print.nextLine();
			
			human.setName(name); // read name from console
			
			
		
			System.out.println("\nPlease enter your weight: (kg)"); // ask user for weight in kilograms
			weight = print.nextDouble(); // read input on console
			mars.setWeight(weight); // send value from attr. weight to method setWeight from class CalculateWeightOnMars
			
			
			System.out.println("\nEnter 1 to enter weight of next person."); // give option to user whether they want to insert another record 
			choice = print.nextInt(); // read choice from console
			print.nextLine();
			
			   
			ListHuman.add("   " + human.getName() + "                " + weight + "                " + Math.round(mars.getWeight() * 100.0) / 100.0);
			// add current record to the list
			// round off the weight on mars
			
			
		}while(choice == 1);
		 // loop will break if the user enter other integers beside 1
		// exception happened if user enter anything besides decimal
		
		
		
		System.out.println("\n\nThe list of information of people's weight would be as follows: ");
		System.out.println("-----------------------------------------------------");
		System.out.println("   Name   |    Weight on Earth   |   Weight on Mars     ");
		System.out.println("--------------------------------------------------");
		
		for(String person:ListHuman)
		{
			// display list of human with their weight on earth and mars
			System.out.println(person);  
			System.out.println("-----------------------------------------------------");
			
		
		}
		
	}
	
	
}

