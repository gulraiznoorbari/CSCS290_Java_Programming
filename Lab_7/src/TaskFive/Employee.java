package TaskFive;

public class Employee {
	private String eName;
	private String eAddress;
	private String eContact;
	
	public Employee (String name, String address, String contact) {	
		this.eName = name;
		this.eAddress = address;
		this.eContact = contact;
	}

	public String geteName() {
		return eName;
	}

	public String geteAddress() {
		return eAddress;
	}

	public String geteContact() {
		return eContact;
	}
	
	public void seteName(String eName) {
		this.eName = eName;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public void seteContact(String eContact) {
		this.eContact = eContact;
	}

}
