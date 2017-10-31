import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class FetchResultDisplay extends JFrame {

	
	public void createFetchPage(Employee employee){
	
		
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
		
		setLayout(new FlowLayout());
		
		setVisible(true);
		setSize(300,300);
	}

	
}	