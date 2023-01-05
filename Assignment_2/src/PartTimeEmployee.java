
public class PartTimeEmployee extends Employee{
	
	private String status;
	private String timing;
	
	public PartTimeEmployee(String name, String gender, String DOB, String contactNo, String address, double salary,
			String status, String timing) {
		super(name, gender, DOB, contactNo, address, salary);
		this.status = status;
		this.timing = timing;
	}

	public String getTiming() {
		return timing;
	}

	public String getStatus() {
		return status;
	}
	
	public void setTiming(String timing) {
		this.timing = timing;
	}
	
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus() + "\nTimings: " + getTiming();
	}
	
}
