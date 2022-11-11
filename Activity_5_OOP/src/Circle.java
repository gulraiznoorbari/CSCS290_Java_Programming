package java;

public class Circle {
	double radius;
	
	public Circle(double rad) {
		radius = rad;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double rad) {
		radius = rad;
	}
	
	public double calculateArea(double radius) {
		return Math.PI * (radius * radius);
	}
	
	public double calculateCircumference(double radius) {
		return 2 * Math.PI * radius;
	}

}
