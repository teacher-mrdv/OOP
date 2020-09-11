import java.util.ArrayList;

public class Zoo
{
	// aggregation example: Zoo has-a Animal
	ArrayList<Animal> population;
	private String zooName;
	
	public Zoo()
	{
		this.population = new ArrayList<Animal>();
	}
	
	public Zoo(String zooName, ArrayList<Animal> population)
	{
		this.zooName = zooName;
		this.population = population;
	}
	
	public String getZooName()
	{
		return zooName;
	}
	public void setZooName(String zooName)
	{
		this.zooName = zooName;
	}
	
	public String toString()
	{
		String output = "Zoo name: " + this.zooName + "\n";
		for(int i = 0; i < this.population.size(); i++)
		{
			output = i + ": " + output +
				this.population.get(i).toString() + "\n";
		}
		return output;
	}
	
}
