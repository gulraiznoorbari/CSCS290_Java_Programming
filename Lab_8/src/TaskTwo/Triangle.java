package TaskTwo;

public class Triangle extends Shape {
	
	private int base;
	private double height;
	public Triangle(int base, double height)
	{
		super(base, height);
		this.base = base;
		this.height = height;
	}
	
	public void computeArea() {
	    System.out.println("Area of Triangle: " + (base * height) / 2);
	}
}
