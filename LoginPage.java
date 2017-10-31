import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class LoginPage extends JFrame {

	ManagerPage managerPage = new ManagerPage();
	EmployeeDao employeeDao = new EmployeeDao();
	EmployeePage employeePage = new EmployeePage();
	JLabel idLabel = new JLabel("ID");
	JTextField idValueTextField = new JTextField(30);
	JLabel passwordLabel = new JLabel("PASSWORD");
	JTextField passwordValueTextField = new JTextField(30);
	JButton loginButtonLabel = new JButton("LOGIN");
	
	public LoginPage() {
		add(idLabel);
		add(idValueTextField);
		add(passwordLabel);
		add(passwordValueTextField);
		add(loginButtonLabel);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		loginButtonLabel.addActionListener(new LoginButtonActionListener());
	}

	public static void main(String[] args) {
		new LoginPage();
	}

	class LoginButtonActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("Employee pressed login button.");
			
			Employee employee = employeeDao.findEmployeeByIdAndPassword(Integer.parseInt(idValueTextField.getText()), passwordValueTextField.getText().trim());
			if(employee == null) {
				System.out.println("Invalid user.");	
			} else {
				if(employee.getDesignation().equals("employee")) {
					System.out.println("User identified as employee.");
					employeePage.createEmployeePage(employee);
				} else if(employee.getDesignation().equals("manager")) {
					System.out.println("User identified as manager.");
					managerPage.createManagerPage(employee);
				} else {
					System.out.println("User designation cannot be identified");
				}
			}	
        }
    }
}
