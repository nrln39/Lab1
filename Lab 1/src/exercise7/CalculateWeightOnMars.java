package exercise7;
import java.util.*;

public class CalculateWeightOnMars {
	private double weight; //attr. weight to hold value passed from console
	static double marsWeight = 0.3783;
	// weight on earth is 0.6217 heavier than on mars
	// weight on mars is 0.3783 lighter than on earth
	
	
	public double getWeight() 
	{
		return weight;
		//return value stored to main method
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight * marsWeight;
		// store value received from main method
	}
	
	
}
