package TaskTwo;

public class Circle extends Shape {
	   private double radius;
	   
	   public Circle(double radius) {
		  super(radius);
		  this.radius = radius;
	   }
	  
	   public void computeArea() {
	      System.out.println("Area of Circle: " + (radius * radius * Math.PI));
	   }
}
