
public class AnimalTest {

	public static void main(String[] args) {
		Animal zero = new Animal();
		Animal pet = new Animal("Bob", 2010);
		Animal newPet = new Animal();
		System.out.println(zero.toString());
		System.out.println(zero.getYearOfBirth() );
		System.out.println(pet);
		pet = new Animal("Fido", 2011);
		System.out.println(pet);
		System.out.println(newPet);
		newPet.setName("Snoopy");
		System.out.println(newPet);
	}

}
