import java.util.*;

public class ZooTest
{
	// find by name, returns index of name or -1
	public static int findName(ArrayList<Animal> animalList, String name)
	{
		int index = -1;
		int len = animalList.size();
		if( len > 0)
		{	for(int i=0; i < len; i++)
			{	if( animalList.get(i).getName().equalsIgnoreCase(name) )
				{	index = i;
					break;
				}
			}
		}
		return index;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		Dog doggie = new Dog("Alberto", 2010, "Chihuahua");
		animals.add(doggie);
		doggie = new Dog("Snoop", 2009, "Rapper");
		animals.add(doggie);
		doggie = new Dog("Bibi", 2012, "Terrier");
		animals.add(doggie);
		Sheep fluffy = new Sheep("Shaun", 2009, false);
		animals.add(fluffy);
		Zoo myZoo = new Zoo("Loco", animals);
		System.out.println(myZoo);
		System.out.println();
		String name = "bibi";
		int indexToRemove = findName(animals, name);
		System.out.println( indexToRemove );
		animals.remove(indexToRemove); // delete item
		System.out.println(myZoo);
				
		
	}

}
