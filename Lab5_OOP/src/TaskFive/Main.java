package TaskFive;

public class Main {

	public static void main(String[] args) {
		Car myHybrid = new Car(); 
		myHybrid.efficiency = 50; 
		myHybrid.fuel_level = 0; 
		myHybrid.addGas(20); 
		myHybrid.drive(100); 
		System.out.println("Remaining Fuel: " + myHybrid.getGasLevel());
	}
}
