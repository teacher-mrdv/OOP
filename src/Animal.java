
public class Animal
{
	// Attributes/Fields/Instance variables/Properties
	private String name;
	private int yearOfBirth;

	// constructors
	public Animal()
	{
	}

	public Animal(String name, int yearOfBirth)
	{
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getYearOfBirth()
	{
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth)
	{
		this.yearOfBirth = yearOfBirth;
	}

	// polymorphism
//	public String toString()
//	{
//		return this.name + "\t" + this.yearOfBirth;
//	}
}
