package exercise7;
import java.util.*;

public class CalculateWeightOnMars {
	private double weight;
	static double marsWeight = 2.20462 * 0.38;
	// kg to lbs = 1 * 2.20462 && weight on earth is 0.38 heavier on mars
	
	
	public double getWeight() 
	{
		return weight;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight * marsWeight;
	}
	
	
}
