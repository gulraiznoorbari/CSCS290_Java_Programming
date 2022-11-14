package TaskTwo;

public class SodaCan {
	double height;
	double radius;
	
	public SodaCan(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double getSurfaceArea(double height, double radius) {
		return ((2 * Math.PI * radius * height) + (2 * Math.PI * (radius * radius)));
	}
	
	public double getVolume(double height, double radius) {
		return (Math.PI * (radius * radius) * height);
	}
}
