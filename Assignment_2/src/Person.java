import java.util.*;
import java.time.*;

public class Person {
	
	private String name;
	private String gender;
	private String DOB;
	private String contactNo;
	private String address;
	
	public Person(String name, String gender, String dOB, String contactNo, String address) {
		this.name = name;
		this.gender = gender;
		this.DOB = dOB;
		this.contactNo = contactNo;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getDOB() {
		return DOB;
	}

	public String getContactNo() {
		return contactNo;
	}

	public String getAddress() {
		return address;
	}
	
	public int calculateAge() {
		String[] arrOfStr = DOB.split("/");
		int year = Integer.parseInt(arrOfStr[arrOfStr.length - 1]);
		int currentYear = Year.now().getValue();
		return currentYear - year;
	} 
	
	public void setName(String name)
	{
		this.name = name;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public void setDOB(String dob) 
	{
		if ((dob.charAt(2) == '/' && dob.charAt(4) == '/' && dob.length() == 9) || (dob.charAt(2) == '/' && dob.charAt(5) == '/' && dob.length() == 10)) {
			this.DOB = dob;
		}
		else
			System.out.print("\nPlease enter the Date in following format: DD/MM/YYYY\n");
	}
	
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "\nName: " + getName() + "\nGender: " + getGender() + "\nDOB: " + getDOB() +
			"\nAge: " + calculateAge() + "\nContact No: " + getContactNo() + "\nAddress: " + getAddress();
	}
}
