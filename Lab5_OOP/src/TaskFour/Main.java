package TaskFour;

public class Main {

	public static void main(String[] args) {
		String name = "Ali";
		String address = "XYZ-LAHORE";
		int salary_per_hour = 10;
		int hours_per_day = 4;
		
		Employee emp = new Employee(name, address, salary_per_hour, hours_per_day);
		emp.addSalary();
		emp.addWork();
		emp.getInfo();
	}

}
