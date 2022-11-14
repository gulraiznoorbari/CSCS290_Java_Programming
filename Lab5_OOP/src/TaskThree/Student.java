package TaskThree;
import java.util.*;

public class Student {
	public String name;
	public int rollno;
	public List<String> courses = new ArrayList<>();
	public double cgpa;
	
	public Student(String name, int rollno, List<String> courses, double cgpa) {
		this.name = name;
		this.rollno = rollno;
		this.courses = courses;
		this.cgpa = cgpa;
	}
	
	public void enroll_course(String course) {
		courses.add(course);
	}
	
	public void drop_course(String course) {
		courses.remove(courses.indexOf(course));
	}
	
	public void display_info() {
		System.out.println("STUDENT INFO");
		System.out.println("Name: " + this.name);
		System.out.println("Roll Number: " + this.rollno);
		System.out.println("Courses: ");
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(i + " " + courses.get(i));
		}
		System.out.println("CGPA: " + this.cgpa);
	}
} 
