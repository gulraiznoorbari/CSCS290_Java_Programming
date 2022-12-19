package TaskTwo;

public class Main {

	public static void main(String[] args) {
		Shape circle = new Circle(10);
		Shape triangle = new Triangle(10, 20);
		circle.computeArea();
		triangle.computeArea();
	}

}
