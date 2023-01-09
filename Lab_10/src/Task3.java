import java.io.*;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("Number of Lines (starting without vowel characters): " + countLinesWithoutVowels("hello.txt"));
	}
	
	public static int countLinesWithoutVowels(String filepath) {
		int linecount = 0;
		try {
			FileReader file = new FileReader(filepath);
			BufferedReader reader = new BufferedReader(file);
			String line = "";
			while((line = reader.readLine()) != null) {
				if (!line.startsWith("a") && !line.startsWith("e") && !line.startsWith("i") && !line.startsWith("o") && !line.startsWith("u")) {
					linecount++;
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return linecount;
	}
}
