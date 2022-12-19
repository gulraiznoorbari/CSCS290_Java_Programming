package TaskTwo;

public class Shape {
	private int base;
	private double height;
	private double radius;
	
	public Shape(int base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	public Shape(double radius) {
		this.radius = radius;
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void computeArea() {
	      System.out.println("Shape Area...");
	}
}
