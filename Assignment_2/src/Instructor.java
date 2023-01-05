
public class Instructor extends Person{
	
	private String department;
	private double income;

	public Instructor(String name, String gender, String DOB, String contactNo, String address, String department, double income) {
		super(name, gender, DOB, contactNo, address);
		this.department = department;
		this.income = income;
	}

	public String getDepartment() {
		return department;
	}

	public double getIncome() {
		return income;
	}
	
	public void setIncome(double income) {
		this.income = income;
	}
	
	public String toString() {
		return "***INSTRUCTOR'S INFO***" + super.toString() + "\nDepartment: " + getDepartment() + 
				"\nIncome: " + getIncome();
	}
	
}
