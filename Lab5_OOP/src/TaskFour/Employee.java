package TaskFour;

public class Employee {
	public String name;
	public String address;
	public int salary_per_hour;
	public int hours_per_day;
	
	public Employee(String name, String address, int salary_per_hour, int hours_per_day) {
		this.name = name;
		this.address = address;
		this.salary_per_hour = salary_per_hour;
		this.hours_per_day = hours_per_day;
	}
	
	public void getInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Salary Per Hour: " + this.salary_per_hour);
		System.out.println("Hours Per Day: " + this.hours_per_day);
		System.out.println("Final Salary: " + (salary_per_hour * hours_per_day));
	}
	
	public void addSalary() {
		if (salary_per_hour < 500) {
			salary_per_hour += 10;
		} 
	}
	
	public void addWork() {
		if (hours_per_day > 6) {
			salary_per_hour += 5;
		}
	}
}
