import java.io.*;

public class Task5 {

	public static void main(String[] args) {
		countLinesAndWords("hello.txt");
	}
	
	public static void countLinesAndWords(String filepath) {
		int lineCount = 0;
		int wordCount = 0;
		try {
			FileReader file = new FileReader(filepath);
			BufferedReader reader = new BufferedReader(file);
			String line = reader.readLine();
			while(line != null) {
				lineCount++;
				String[] words = line.split("\\s+"); 
				// split the string into string of array with separator as space or multiple spaces
				wordCount += words.length;
				line = reader.readLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Number of Lines: " + lineCount);
		System.out.println("Number of Words: " + wordCount);
	}
}
