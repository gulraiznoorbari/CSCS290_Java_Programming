
public class Main 
{
	public static void main(String[] args) {

		// TASK #2
		Person p = new Person("Ali", "M", "12/02/1999", "111222333", "XYZ-Lahore");
		System.out.println(p.toString());
//		p.setDOB("29/9/1996");
//		System.out.println(p.toString());
//		p.setDOB("29/009/1996");
//		System.out.println(p.toString());
		System.out.println();
		Student s = new Student("Ahmad", "M", "25/5/2000", "111234567", "ABC-Lahore", "6789", "Computer Science", 3.5);
		System.out.println(s.toString());
		System.out.println();
		Instructor i = new Instructor("Asim", "M", "06/11/1989", "352267886", "ABC-Lahore", "Computer Science", 150000);
		System.out.println(i.toString());
		System.out.println();
		
		// TASK #3
		System.out.println("DATA BEFORE CHANGE:");
		System.out.println("Student Major: " + s.getMajor());
		System.out.println("Student CGPA: " + s.getCGPA());
		System.out.println("Instructor Contact No: " + i.getContactNo());
		System.out.println("Instructor Address: " + i.getAddress());
		s.setMajor("Mass Communication");
		s.updateCGPA(3.75);
		i.setContactNo("999888777");
		i.setAddress("Model Town-Lahore");
		System.out.println("\nDATA AFTER CHANGE:");
		System.out.println("Student Major: " + s.getMajor());
		System.out.println("Student CGPA: " + s.getCGPA());
		System.out.println("Instructor Contact No: " + i.getContactNo());
		System.out.println("Instructor Address: " + i.getAddress());
		System.out.println();
		
		// TASK #4
		Employee e = new Employee("Gulraiz", "M", "19/5/2002", "886677", "Lahore", 150000);
		System.out.println(e.toString());
		System.out.println();
		FullTimeEmployee fte = new FullTimeEmployee("Saad", "M", "16/6/2001", "68888", "Lahore", 200000, "Full-Time");
		System.out.println(fte.toString());
		System.out.println();
		PartTimeEmployee pte = new PartTimeEmployee("Hassan", "M", "26/8/2000", "57775", "Lahore", 40000, "Part-Time", "4-8pm");
		System.out.println(pte.toString());
		System.out.println();
		
		//TASK #5
		System.out.println("DATA BEFORE CHANGE:");
		System.out.println("Part-Time Employee Timings: " + pte.getTiming());
		System.out.println("Full-Time Employee Contact No: " + fte.getContactNo());
		System.out.println("Full-Time Employee Address: " + fte.getAddress());
		pte.setTiming("6-10pm");
		fte.setContactNo("9111");
		fte.setAddress("Islamabad");
		System.out.println("\nDATA AFTER CHANGE:");
		System.out.println("Part-Time Employee Timings: " + pte.getTiming());
		System.out.println("Full-Time Employee Contact No: " + fte.getContactNo());
		System.out.println("Full-Time Employee Address: " + fte.getAddress());
	
	}
}
