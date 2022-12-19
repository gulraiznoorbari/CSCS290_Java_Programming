package TaskOne;

public class Car extends Vehicle {
	private int horsePower;
	
	public Car(String vColor, int vModel, String vName, int horsePower) 
	{
		super(vColor, vModel, vName);
		this.horsePower = horsePower;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public String toString() {
		return super.toString() + "\nCar Horse Power: " + this.horsePower;
	}
	
}
