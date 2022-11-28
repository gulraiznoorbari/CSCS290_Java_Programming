package TaskOne;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student("Ali", "XYZ-LAHORE", "Computer Science", 2022, 150000);
		System.out.println(std.toString());
		System.out.println();
		Staff staff = new Staff("Ali", "XYZ-LAHORE", "LGS", 80000);
		System.out.println(staff.toString());
	}

}
