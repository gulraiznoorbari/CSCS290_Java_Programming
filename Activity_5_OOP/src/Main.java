package java;

public class Main {

	public static void main(String[] args) {
		// Rectangle Class:
		double length = 5;
		double width = 5;
		
		Rectangle rect = new Rectangle(length, width);
		
		rect.setLength(7);
		System.out.println(rect.getLength());
		
		System.out.println(rect.calculateArea(length, width));
		System.out.println(rect.calculatePerimeter(length, width));
		
		
		// Activity:
		
		//Task #1
		MyClass c = new MyClass();
		
		//Task #2
		double radius = 10;
		Circle circle = new Circle(radius);
		circle.setRadius(15);
		System.out.println(circle.calculateArea(radius));
		System.out.println(circle.calculateCircumference(radius));
		
		//Task #3
		
	}

}
