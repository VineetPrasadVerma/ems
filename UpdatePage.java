import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class UpdatePage extends JFrame {

	EmployeeDao employeeDao = new EmployeeDao();
	JLabel idLabel = new JLabel("ID:");
	JTextField idValueTextField = new JTextField(30);
	JLabel salaryLabel = new JLabel("SALARY:");
	JTextField salaryValueTextField = new JTextField(30);
	JButton updateButton = new JButton("UPDATE SALARY");

	public void createUpdatePage(){
	

		
		add(idLabel);
		add(idValueTextField);
		add(salaryLabel);
		add(salaryValueTextField);
		add(updateButton);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		updateButton.addActionListener(new UpdateButtonActionListener());
	}

	

	class UpdateButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("Update button pressed.");
			employeeDao.updateEmployee(Integer.parseInt(idValueTextField.getText()), Double.parseDouble(salaryValueTextField.getText()));
        }
    } 

}	
 