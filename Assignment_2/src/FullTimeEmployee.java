
public class FullTimeEmployee extends Employee{
	
	private String status;

	public FullTimeEmployee(String name, String gender, String DOB, String contactNo, String address, double salary,
			String status) {
		super(name, gender, DOB, contactNo, address, salary);
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}
