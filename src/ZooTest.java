
public class ZooTest
{

	public static void main(String[] args)
	{
		Zoo colegioBautista = new Zoo();
		Dog pet = new Dog("Bob", 2010, "Chihuahua");
		colegioBautista.population.add(pet);
		pet = new Dog("Can", 2009, "Loly");
		colegioBautista.population.add(pet);
		pet = new Dog("Bibi", 2012, "Lisa");
		colegioBautista.population.add(pet);
		

	}

}
