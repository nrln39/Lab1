package exercise7;
import java.util.*;

public class CalculateWeightOnMars {
	private double weight;
	static double marsWeight = 0.3783;
	// weight on earth is 0.6217 heavier than on mars
	// weight on mars is 0.3783 lighter than on earth
	
	
	public double getWeight() 
	{
		return weight;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight * marsWeight;
	}
	
	
}
