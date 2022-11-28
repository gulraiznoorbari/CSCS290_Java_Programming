package TaskOne;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nAddress: " + this.address;
	}
}
