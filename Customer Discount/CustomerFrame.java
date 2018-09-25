// Author:		Daniel Kramer

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomerJFrame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 2L;
	
	//fields
	private JLabel nameJLabel;
	private JLabel idJLabel;
	private JLabel messageJLabel;
	private JTextField nameJTextField;
	private JTextField idJTextField;
	private JButton submitJButton;
	private OnlineCustomer Customer;
	
	private final int WIDTH = 250;
	private final int HEIGHT = 200;

	public CustomerJFrame()
	{
		//Call the Super Constructor
		super("Project By Kramer");
		
		// set the height and width of the JFrame
		setSize(WIDTH, HEIGHT);
		
		this.setResizable(false);
	
		//Set the default layout
		setLayout(new FlowLayout());
	
		// create a name label, id label and add it to the frame
		nameJLabel = new JLabel("Name: ");
		add(nameJLabel);
		
		// create a JTextField for name and add it to the frame
		nameJTextField = new JTextField(null, 17);
		add(nameJTextField);
		
		
		idJLabel = new JLabel("        Id: ");
		add(idJLabel);
		
		//create text field for ID and add it to the frame
		idJTextField = new JTextField(null, 17);
		add(idJTextField);
		
		
		//  create and add a message JLabel
		messageJLabel = new JLabel("Customer: name, id: 0000, Discount: 0%");
		// create a new font for the label
		Font myFont = new Font("Arial", Font.BOLD | Font.ITALIC, 12);
		messageJLabel.setFont(myFont);
		add(messageJLabel);
		
		//Create a submit button
		submitJButton = new JButton("Submit");
		submitJButton.setToolTipText("Click this button to see the discount provided");
		submitJButton.addActionListener(this);
		add(submitJButton);
		
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e)
	{
		//Create online discount customer constructor
		OnlineCustomer onlineDiscount = new OnlineCustomer(nameJTextField.getText(), idJTextField.getText());
		
		
		// get the customers entered name from the JTextField
		String results = "Name: " + onlineDiscount.getName() + ", " + "ID: " + onlineDiscount.getId() + ", " + "Discount: " + onlineDiscount.discount() + "%";                        
		
		// set the results to the message JLabel
		messageJLabel.setText(results);	
	}	
}
