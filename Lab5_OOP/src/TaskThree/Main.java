package TaskThree;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String name = "Ali";
		int rollno = 12345;
		List<String> courses = new ArrayList<>();
		double cgpa = 3.75;

		Student st = new Student(name, rollno, courses, cgpa);
		st.enroll_course("java");
		st.enroll_course("compiler");
		st.enroll_course("os");
		st.drop_course("compiler");
		st.display_info();
	}

}
