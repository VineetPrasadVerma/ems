import java.sql.*;

public class EmployeeDao{

	/**
	*/
	public void addEmployee(int id, String name, String address, String contact, double salary, String designation, String password) {
		try{
			System.out.println("Inserting employee with id: " + id);
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","root");
			Statement statement = connection.createStatement();

			String query = "insert into employee values("+ id +", '"+name+"', '"+address+"', '"+contact+"', " + salary +", '"+designation+"', '"+password+"')";
			System.out.println("Query: " + query);

			statement.executeUpdate(query);
			System.out.println("Employee inserted with id: " + id);
			connection.close();
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("Error while inserting employee with id: " + id);
			e.printStackTrace();
		}
	}

	/**
	*/
	public Employee fetchEmployee(int id) {
		Employee employee = null;
		try{
			System.out.println("Fetch Employee with id " +id);
			Class.forName("com.mysql.jdbc.Driver");
	 
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","root");
			
			Statement statement = connection.createStatement();			
			
			String query = "select name, address, contact, salary from employee where id = " +id;
			System.out.println("Query = "+query);
			ResultSet results=statement.executeQuery(query);
			if(results.next()){
				employee = new Employee();	
				String name = results.getString(1);
				String address = results.getString(2);
				String contact = results.getString(3);
				double salary = results.getDouble(4);
					
				employee.setId(id);
				employee.setName(name);
				employee.setAddress(address);
				employee.setContact(contact);
				employee.setSalary(salary);
			}
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("Error while fetching employee with id: " + id);
			e.printStackTrace();
		}
		return employee;
	}

	/**
	*/
	public void updateEmployee(int id, double salary) {
		try{
			System.out.println("Updating salary for employee with id: " + id);
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","root");
			Statement statement = connection.createStatement();			
			
			
			String query = "update employee set salary ="+salary+"where id ="+id;
			System.out.println("Query: " + query);

			statement.executeUpdate(query);
			System.out.println("Updated salary for employee with id: " + id);
			connection.close();
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("Error while updating salary for employee with id: " + id);
			e.printStackTrace();
		}
	}

	/**
	*/
	public void deleteEmployee(int id) {
		try{
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","root");
			System.out.println("Delete employee with id: " + id);
			Statement statement = connection.createStatement();			
					
			String query="delete from employee where id="+id;
	        System.out.println(query);	
			statement.executeUpdate(query);

			System.out.println("Deleted employee with id: " + id);
			connection.close();
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("Error while deleting employee with id: " + id);
			e.printStackTrace();
		}		    
	}

	public Employee findEmployeeByIdAndPassword(int id, String password){
		Employee employee = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","root");
			System.out.println("finding designation of employees");
			Statement statement = connection.createStatement();			
					
			String query = "select name, address, contact, salary, desg from employee where id= "+id+" and password ='"+password+"'";
            System.out.println("Query = "+query);
			ResultSet results=statement.executeQuery(query);
			if(results.next()){
				employee = new Employee();	
				String name = results.getString(1);
				String address = results.getString(2);
				String contact = results.getString(3);
				double salary = results.getDouble(4);
				String designation = results.getString(5);

				employee.setId(id);
				employee.setName(name);
				employee.setAddress(address);
				employee.setContact(contact);
				employee.setSalary(salary);
				employee.setDesignation(designation);
			}

            connection.close();
			
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("Error while finding designation for employee with id: " + id);
			e.printStackTrace();
		}
		return employee;		    
    }
    		
}