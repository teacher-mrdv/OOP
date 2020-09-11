import java.util.*;

public class ZooTest
{

	public static void main(String[] args)
	{
		ArrayList<Animal> alist = new ArrayList<Animal>();
		Dog pet = new Dog("Bob", 2010, "Chihuahua");
		alist.add(pet);
		pet = new Dog("Can", 2009, "Loly");
		alist.add(pet);
		pet = new Dog("Bibi", 2012, "Lisa");
		alist.add(pet);
		Zoo loco = new Zoo("Loco", alist);
		System.out.println(loco);

	}

}
