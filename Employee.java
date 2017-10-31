public class Employee{
	private int id;
	private String name;
	private String address;
	private String contact;
	private double salary;
	private String designation;

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public String getContact(){
		return contact;
	}

	public double getSalary(){
		return salary;
	}

	public String getDesignation(){
		return designation;
	}

	public void setId(int id){
		this.id=id;
	}

	public void setName(String name){
		this.name=name;
	}

	public void setAddress(String address){
		this.address=address;
	}

	public void setContact(String contact){
		this.contact=contact;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}

	public void setDesignation(String designation){
		this.designation=designation;
	}


}