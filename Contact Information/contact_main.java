//Author:		Daniel Kramer
//Description:	Create a class that take users input data and shows them the output

import javax.swing.*;

public class TestContact 
{
	public static void main(String[] args)
	{
		// use the default constructor to display default values
		Contact myContact = new Contact("None", "000-000-0000", "Example@hotmail.com");
		
		boolean invalid = true;
		int index1;
		int index2;
		
		//use a while loop to collect data from the user
		while(invalid)
		{
			//declare the variables
			String entry;
			String newName;
			String newPhone;
			String newEmail;
			
			//ask for the users name, phone number, and email
			entry = JOptionPane.showInputDialog(null, "Please enter your name, phone number, and email with spaces in between each input");
			
			//use the if statement to continue the statement if the entry us not null
			if(entry != null)
			{
				//use index to seperate the string
				index1 = entry.indexOf(' ');
				index2 = entry.indexOf(' ', + index1 + 1);
				
				//continue by using the if statement if the name is more than 10 characters long
				if(index1 > 10)
				{
					//seperate into 3 strings
					newName = entry.substring(0, index1);
					newPhone = entry.substring(index1 + 1, index2);
					newEmail = entry.substring(index2 + 1);
					
					//create new contact object
					Contact newContact = new Contact(newName, newPhone, newEmail);
								
					//show the user input
					JOptionPane.showMessageDialog(null, "Your name is: " + newContact.getName() +
													"\nYour phone number is: " + newContact.getPhone() +
													"\nYour email is: " + newContact.getEmail());			
				
					invalid = false;
				}				
			}		
		}
		
		System.exit(0);	
	}
}
