import java.util.*;

public class ZooTest
{
	public int findName(String name)
	{
		int index = -1;
		
		return index;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Animal> alist = new ArrayList<Animal>();
		Dog pet = new Dog("Bob", 2010, "Chihuahua");
		alist.add(pet);
		pet = new Dog("Can", 2009, "Loly");
		alist.add(pet);
		pet = new Dog("Bibi", 2012, "Lisa");
		alist.add(pet);
		Sheep baah = new Sheep("Beba", 2009, false);
		alist.add(baah);
		Zoo loco = new Zoo("Loco", alist);
		System.out.println(loco);
		
	}

}
