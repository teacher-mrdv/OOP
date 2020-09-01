
public class Dog extends Animal
{
	private String breed;
	
	public Dog() { }
	
	public Dog(String name, int yearOfBirth, String breed)
	{
		super(name, yearOfBirth);
		this.breed = breed;
	}

	public String getBreed()
	{
		return breed;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	// in dog years - overriding getAge() in Animal (polymorphism)
	public int getAge()
	{
		return super.getAge() * 7;
	}
	
	// another silly example of polymorphism.
	public void talk()
	{
		System.out.println("Bow wow");
	}
	
	// overriding toString() in Animal (polymorphism)
	public String toString()
	{
		return super.toString() + "\tBreed: " + breed;
	}
	
}
