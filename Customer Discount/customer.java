//Author:		Daniel Kramer
//Description:	Create a abstract class with a public constructor and abstract method

public abstract class Customer 
{
	//Private Fields
	private String name;
	private String id;
	
	//Public Constructor
	public Customer(String aName, String aId)
	{
		name = aName;
		id = aId;			
	}
	
	//Public Get Methods
	public String getName()
	{
		return name;
	}
	
	public String getId()
	{
		return id;
	}

	
	//Abstract Method
	public abstract int discount();	
}
