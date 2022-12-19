package TaskOne;

public class Vehicle {
	private String color;
	private int model;
	private String name;
	
	public Vehicle(String vColor, int vModel, String vName)
	{
		this.color = vColor;
		this.model = vModel;
		this.name = vName;
	}

	public String getColor() {
		return color;
	}

	public int getModel() {
		return model;
	}

	public String getName() {
		return name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nModel: " + this.model + "\nColor: " + this.color;
	}
	
}
