
public class DogTest
{

	public static void main(String[] args)
	{
		Dog zero = new Dog();
		Dog pet = new Dog("Bob", 2010, "Chihuahua");
		Animal newPet = pet;
		System.out.println(zero + "\n");
		System.out.println(pet);
		System.out.println(newPet);
		pet = new Dog("Fido", 2011, "Terrier");
		System.out.println(pet);
		System.out.println(newPet);
		newPet.setName("Snoopy");
		System.out.println(newPet.toString());

	}

}
