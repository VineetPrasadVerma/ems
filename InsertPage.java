import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class InsertPage extends JFrame {

	EmployeeDao employeeDao = new EmployeeDao();
	JLabel idLabel = new JLabel("ID:");
	JTextField idValueTextField = new JTextField(30);
	JLabel nameLabel = new JLabel("NAME:");
	JTextField nameValueTextField = new JTextField(30);
	JLabel contactLabel = new JLabel("CONTACT:");
	JTextField contactValueTextField = new JTextField(30);
	JLabel addressLabel = new JLabel("ADDRESS:");
	JTextField addressValueTextField = new JTextField(30);
	JLabel salaryLabel = new JLabel("SALARY:");
	JTextField salaryValueTextField = new JTextField(30);
	JLabel designationLabel = new JLabel("DESIGNATION:");
	JTextField designationValueTextField = new JTextField(30);
	JLabel passwordLabel = new JLabel("PASSWORD:");
	JTextField passwordLabelTextField = new JTextField(30);
	JButton insertButton = new JButton("ADD EMPLOYEE");
    
	public void createInsertPage() {
		

		add(idLabel);
		add(idValueTextField);
		add(nameLabel);
		add(nameValueTextField);
		add(contactLabel);
		add(contactValueTextField);
		add(addressLabel);
		add(addressValueTextField);
		add(salaryLabel);
		add(salaryValueTextField);
		add(designationLabel);
		add(designationValueTextField);
		add(passwordLabel);
		add(passwordLabelTextField);
		add(insertButton);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		insertButton.addActionListener(new InsertButtonActionListener());
	}

	class InsertButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("Insert button pressed.");
			employeeDao.addEmployee(Integer.parseInt(idValueTextField.getText()), nameValueTextField.getText(), contactValueTextField.getText(), addressValueTextField.getText(), Double.parseDouble(salaryValueTextField.getText()), designationValueTextField.getText(), passwordLabelTextField.getText());
    	}
	} 

}	
 
