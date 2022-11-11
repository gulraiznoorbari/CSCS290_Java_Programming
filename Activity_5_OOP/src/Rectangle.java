package java;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle (double l, double w) {
		length = l;
		width = w;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setLength(double len) {
		length = len;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public double calculateArea(double length, double width) {
		return length * width;
	}
	
	public double calculatePerimeter(double length, double width) {
		return 2 * (length + width);
	}
} 
