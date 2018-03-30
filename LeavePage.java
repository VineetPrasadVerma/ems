import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class LeavePage extends JFrame {
	
	JLabel noOfDaysLabel = new JLabel("NO OF DAYS");
	JTextField noOfDaysValueTextField = new JTextField(30);
	JButton submitButton = new JButton("SUBMIT");
	

	public void createLeavePage(){
		add(noOfDaysLabel);
		add(noOfDaysValueTextField);
	    add(submitButton);	
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		submitButton.addActionListener(new SubmitButtonActionListener());
	}

	class SubmitButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("Submit button pressed.");
			
			System.out.println("Leave Applied");
    	}
	} 
}