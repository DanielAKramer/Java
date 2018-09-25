//Author:		Daniel Kramer
//Description:	Create a class to collect data the user types in

public class Contact 
{
	//Variables
	
	private	String phone;
	private	String name;
	private	String email;
	
	
	//Default Constructor to initialize the name, phone, and email
	
	public Contact(String aName, String aPhone, String aEmail)
	{
		name = aName;
		phone = aPhone;
		email = aEmail;
	}
	
	
	//Public Get Methods
	
	public String getPhone()
	{
		return phone;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	
	//Set Methods
	
	public void setPhone(String aPhone)
	{
		phone = aPhone;
	}
	
	public void setName(String aName)
	{
		name = aName;
	}
	
	public void setEmail(String aEmail)
	{
		email = aEmail;
	}	
}
