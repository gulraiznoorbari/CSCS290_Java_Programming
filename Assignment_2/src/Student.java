
public class Student extends Person{
	
	private String rollNo;
	private String major;
	private double cgpa;
	
	public Student(String name, String gender, String DOB, String contactNo, String address, String rollNo,
			String major, double cgpa) {
		super(name, gender, DOB, contactNo, address);
		this.rollNo = rollNo;
		this.major = major;
		this.cgpa = cgpa;
	}

	public String getMajor() {
		return major;
	}

	public String getRollNo() {
		return rollNo;
	}

	public double getCGPA() {
		return cgpa;
	}
	
	public void updateCGPA(double GPA) {
		this.cgpa = ((cgpa + GPA) / 2);
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return "***STUDENT'S INFO***" + super.toString() + "\nRoll Number: " + getRollNo() + "\nMajor: " + getMajor() + "\nCGPA: " + getCGPA();
	}
	
}
