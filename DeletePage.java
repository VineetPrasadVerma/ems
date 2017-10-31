import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class DeletePage extends JFrame {

	EmployeeDao employeeDao = new EmployeeDao();
	JLabel idLabel = new JLabel("ID:");
	JTextField idValueTextField = new JTextField(30);
	    
	JButton deleteButton = new JButton("DELETE EMPLOYEE");
	
	public void createDeletePage(){
		
		add(idLabel);
		add(idValueTextField);
		
		add(deleteButton);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		deleteButton.addActionListener(new DeleteButtonActionListener());
	}

	

	class DeleteButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("Delete button pressed.");
			employeeDao.deleteEmployee(Integer.parseInt(idValueTextField.getText()));
		}	
    } 

}	
 