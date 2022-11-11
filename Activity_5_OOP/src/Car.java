package java;

public class Car {
	String name;
	String color;
	String type;
	
	public Car(String name, String color, String type) {
		this.name = name;
		this.color = color;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void printCarDetails() {
		System.out.println("Car Name: " + this.name);
		System.out.println("Car Color: " + this.color);
		System.out.println("Car Type: " + this.type);
		
	}
}
