import java.util.ArrayList;

public class TaskThree {

	public static void main(String[] args) {
			ArrayList<String> animalsList = new ArrayList<String>();
			animalsList.add("Cats");
			animalsList.add("Dogs");
			animalsList.add("Cow");
			int n = 1;
			String name = "Elephant";
			System.out.println(animals(animalsList, n, name));
	}
	
	private static ArrayList<String> animals(ArrayList<String> animalsList, int n, String animalName) {
		ArrayList<String> animalout = (ArrayList<String>) animalsList.clone();
		animalout.remove(n);
		animalout.add(animalName);
		
		return animalout;
	}

}
