package TaskFive;

public class Car {
	public double efficiency;
	public double fuel_level;
	
	public Car() {
		this.efficiency = 50;
		this.fuel_level = 0;
	}
	
	public void addGas(double fuel) {
		this.fuel_level += fuel;
	}
	
	public void drive(double distance_travelled) {
		double fuel_reduced = distance_travelled / efficiency;
		fuel_level -= fuel_reduced;
	}
	
	public double getGasLevel() {
		return this.fuel_level;
	}
}
