//Author:		Daniel Kramer

public class OnlineCustomer extends Customer 
{
	
	//Public Constructor
	public OnlineCustomer(String aName, String aId)
	{
		super(aName, aId);
			
	}
	
	//Override discount method
	public int discount()
	{
		return 10;
	}	
}
