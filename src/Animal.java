/*
 *  NOTE: Abstract classes cannot be instantiated!
 */
import java.util.Date;

public abstract class Animal
{
	// Attributes/Fields/Instance variables/Properties
	private String name;
	private int yearOfBirth;

	// constructors (example of overloading)
	// java.util.Date is a deprecated class (obsolete)
	public Animal()
	{
		Date today = new Date();
		int currentYear = 1900 + today.getYear();
		this.name = "unnamed";
		this.yearOfBirth = currentYear;
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

	public int getAge()
	{
		Date today = new Date();
		int currentYear = 1900 + today.getYear();
		return currentYear - this.yearOfBirth;
	}
	
	// abstract forces us to write (and override) the method in the subclass(es)
	public abstract void talk();
	
	// polymorphism
	public String toString()
	{
		String s = "Name:" + this.name + "\tYoB: " +
					this.yearOfBirth + "\tAge: " + this.getAge();
		return s;
	}
}
