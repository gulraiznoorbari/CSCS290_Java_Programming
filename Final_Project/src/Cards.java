
public class Cards {
	private String color, faceValue;
	
	public Cards(String Color, String FaceValue) {
		this.color = Color;
		this.faceValue = FaceValue;
	}
	
	public void setColor(String Color) {
		this.color = Color;
	}
	
	public void setFaceValue(String FaceValue) {
		this.faceValue = FaceValue;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getFaceValue() {
		return faceValue;
	}
	
	public String toString() {
		return "\n***CARD***\nColor: " + getColor() + "\nFace Value: " + getFaceValue();
	}
}
