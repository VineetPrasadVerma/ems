import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class FetchPage extends JFrame {

	EmployeeDao employeeDao = new EmployeeDao();
	FetchResultDisplay fetchResultDisplay = new FetchResultDisplay();

	JLabel idLabel = new JLabel("ID:");
	JTextField idValueTextField = new JTextField(30);
	JButton fetchButton = new JButton("GET DETAILS");
	
	public void createFetchPage(){
		add(idLabel);
		add(idValueTextField);
		add(fetchButton);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		fetchButton.addActionListener(new FetchButtonActionListener());


	}
	class FetchButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("Fetch button pressed.");
			int id = Integer.parseInt(idValueTextField.getText());
			Employee employee = employeeDao.fetchEmployee(id);
			if(employee == null){
				System.out.println("NO EMPLOYEE FOR ID : "+id);
			}else{
				fetchResultDisplay.createFetchPage(employee);

			}
    	}
	} 
}