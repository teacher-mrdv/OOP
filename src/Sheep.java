/**
 * @author ofs
 *
 */
public class Sheep extends Animal
{
	private boolean sheered;
	
	public Sheep()
	{
		super();
		this.setSheered(false);
	}
	
	public Sheep(String name, int yearOfBirth, char sheered)
	{
		super(name, yearOfBirth);
		sheered = Character.toUpperCase(sheered);
		if( sheered == 'Y')
		{
			this.setSheered(true);
		} else {
			this.setSheered(false);
		}
	}

	// is- methods return booleans ONLY
	public boolean isSheered()
	{
		return sheered;
	}

	public char getSheered()
	{
		if( sheered == true)
		{
			return 'Y';
		} else {
			return 'N';
		}
	}
	
	public void setSheered(boolean sheered)
	{
		this.sheered = sheered;
	}
	
	public void setSheered(char sheered)
	{
		if( sheered == 'Y')
		{
			this.setSheered(true);
		} else {
			this.setSheered(false);
		}
	}
	
	public void talk()
	{
		System.out.println("Baaaaaaah");
	}
	
	// overriding toString() in Animal (polymorphism)
	public String toString()
	{
		return super.toString() + "\tSheered: "
				+ this.getSheered();
	}
}
