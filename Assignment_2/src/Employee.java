
public class Employee extends Person{
	
	private double salary;

	public Employee(String name, String gender, String DOB, String contactNo, String address, double salary) {
		super(name, gender, DOB, contactNo, address);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return "***EMPLOYEE'S INFO***" + super.toString() + "\nSalary: " + getSalary();
	}
}
