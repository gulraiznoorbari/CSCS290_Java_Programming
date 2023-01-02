package TaskOne;

public class Circle implements Shape {
	private double radius;
	
	public Circle(double cRadius) {
		this.radius = cRadius;
	}
	
	public double getSide() {
		return radius;
	}
	public void setSide(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return (Math.PI * (radius * radius));
	}
	public double getPerimeter() {
		return (2 * Math.PI * radius);
	}
	public String toString() {
		return "Radius of Circle: " + radius + "\nArea of Circle: " + getArea() + "\nPerimeter/Circumference of Circle: " + getPerimeter();
	}
}
