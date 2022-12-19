package TaskOne;

public class Main {

	public static void main(String[] args) {
		Vehicle c = new Car("Black", 2020, "Honda", 2000);
		Vehicle t = new Truck("White", 2018, "Toyota", 3000);
		System.out.println(c.toString());
		System.out.println(t.toString());
	}
}
