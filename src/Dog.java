
public class Dog extends Animal
{
	private String breed;
	
	public Dog() { }
	
	public Dog(String name, int yearOfBirth, String breed)
	{
		super(name, yearOfBirth);
		this.setBreed(breed);
	}

	public String getBreed()
	{
		return breed;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public String toString()
	{
		return super.toString() + "\t" + breed;
	}
	
}
