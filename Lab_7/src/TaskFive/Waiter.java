package TaskFive;

public class Waiter extends Employee{
	private String wEmail;
	private String wSalary;
	private String eType;
	
	public Waiter(String name, String address, String contact, String email, String salary, String type) {
		super(name, address, contact);
		this.wEmail = email;
		this.wSalary = salary;
		this.eType = type;
	}

	public String getmEmail() {
		return wEmail;
	}

	public String geteType() {
		return eType;
	}
	
	public String getmSalary() {
		return wSalary;
	}
	
	public void setmEmail(String mEmail) {
		this.wEmail = mEmail;
	}

	public void setmSalary(String mSalary) {
		this.wSalary = mSalary;
	}

	public void seteType(String eType) {
		this.eType = eType;
	}
	
	

}
