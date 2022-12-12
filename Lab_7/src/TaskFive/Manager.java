package TaskFive;

public class Manager extends Employee{
	private String mEmail;
	private String mSalary;
	private String eType;
	
	public Manager(String name, String address, String contact, String email, String salary, String type) {
		super(name, address, contact);
		this.mEmail = email;
		this.mSalary = salary;
		this.eType = type;
	}

	public String getmEmail() {
		return mEmail;
	}

	public String geteType() {
		return eType;
	}
	
	public String getmSalary() {
		return mSalary;
	}
	
	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	public void setmSalary(String mSalary) {
		this.mSalary = mSalary;
	}

	public void seteType(String eType) {
		this.eType = eType;
	}
	
	

}
