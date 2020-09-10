
public class ZooTest
{

	public static void main(String[] args)
	{
		Zoo loco = new Zoo();
		Dog pet = new Dog("Bob", 2010, "Chihuahua");
		loco.population.add(pet);
		pet = new Dog("Can", 2009, "Loly");
		loco.population.add(pet);
		pet = new Dog("Bibi", 2012, "Lisa");
		loco.population.add(pet);
		System.out.println(loco);

	}

}
