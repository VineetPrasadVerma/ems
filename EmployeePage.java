import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class EmployeePage extends JFrame {
	LeavePage leavePage = new LeavePage();


	public void createEmployeePage(Employee employee){

		JLabel idLabel = new JLabel("ID:");
		JLabel idValueLabel = new JLabel(String.valueOf(employee.getId()));
		JLabel nameLabel = new JLabel("NAME:");
		JLabel nameValueLabel = new JLabel(employee.getName());
		JLabel contactLabel = new JLabel("CONTACT:");
		JLabel contactValueLabel = new JLabel(employee.getContact());
		JLabel addressLabel = new JLabel("ADDRESS:");
		JLabel addressValueLabel = new JLabel(employee.getAddress());
		JLabel salaryLabel = new JLabel("SALARY:");
		JLabel salaryValueLabel = new JLabel(String.valueOf(employee.getSalary()));
	
		JButton applyLeaveButton = new JButton("APPLY LEAVE");
	
		add(idLabel);
		add(idValueLabel);
		add(nameLabel);
		add(nameValueLabel);
		add(contactLabel);
		add(contactValueLabel);
		add(addressLabel);
		add(addressValueLabel);
		add(salaryLabel);
		add(salaryValueLabel);
	    add(applyLeaveButton);	
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		applyLeaveButton.addActionListener(new LeaveButtonActionListener());
	}

	class LeaveButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("Leave button pressed.");
			leavePage.createLeavePage();
    	}
	} 

	
}	