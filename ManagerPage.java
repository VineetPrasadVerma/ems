import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ManagerPage extends JFrame {
    InsertPage insertPage = new InsertPage();
    DeletePage deletePage = new DeletePage();
    UpdatePage updatePage = new UpdatePage();
    FetchPage fetchPage = new FetchPage();

	

	public void createManagerPage(Employee employee){
	
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

	    JButton addEmployeeButton = new JButton("ADD EMPLOYEE");
	    JButton updateEmployeeButton = new JButton("UPDATE EMPLOYEE");
	    JButton deleteEmployeeButton = new JButton("DELETE EMPLOYEE");
	    JButton fetchEmployeeButton = new JButton("FETCH EMPLOYEE");

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
		add(addEmployeeButton);
		add(updateEmployeeButton);
		add(deleteEmployeeButton);
		add(fetchEmployeeButton);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		addEmployeeButton.addActionListener(new AddEmployeeButtonActionListener());
		updateEmployeeButton.addActionListener(new UpdateEmployeeButtonActionListener());
		deleteEmployeeButton.addActionListener(new DeleteEmployeeButtonActionListener());
		fetchEmployeeButton.addActionListener(new FetchEmployeeButtonActionListener());
	}

	

	class AddEmployeeButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("Manager pressed add employee button.");
			insertPage.createInsertPage();
        }
    }

    class UpdateEmployeeButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("Manager pressed update employee button.");
			updatePage.createUpdatePage();
        }
    } 

    class FetchEmployeeButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("Manager pressed fetch employee button.");
			fetchPage.createFetchPage();
        }
    } 

    class DeleteEmployeeButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("Manager pressed delete employee button.");
			deletePage.createDeletePage();
        }
    }       
}	 