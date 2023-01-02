package TaskOne;

public class Square implements Shape{
	private double length;
	public Square(double slength) {
		this.length = slength;
	}
	
	public double getSide() {
		return length;
	}
	
	public void setSide(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return (length * length);
	}
	
	public double getPerimeter() {
		return (4 * length);
	}
	public String toString() {
		return "Length of Square: " + getSide() + "\nArea of Square: " + getArea() + "\nPerimeter of Square: " + getPerimeter();
	}
}
