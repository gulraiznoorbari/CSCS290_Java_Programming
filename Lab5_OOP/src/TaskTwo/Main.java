package TaskTwo;

public class Main {

	public static void main(String[] args) {
		double height = 10;
		double radius = 4;
		SodaCan cylinder = new SodaCan(height, radius);
		System.out.println("Surface Area of Soda Can: " + cylinder.getSurfaceArea(height, radius));
		System.out.println("Volume of Soda Can: " + cylinder.getVolume(height, radius));
	}

}
