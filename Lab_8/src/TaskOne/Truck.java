package TaskOne;

public class Truck extends Vehicle {
	private int horsePower;
	
	public Truck(String vColor, int vModel, String vName, int horsePower) 
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
		return super.toString() + "\nTruck Horse Power: " + this.horsePower;
	}
}
