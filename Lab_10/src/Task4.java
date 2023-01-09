import java.io.*;

public class Task4 {

	public static void main(String[] args) {
		scores("scores.txt");
	}
	
	public static void scores(String filepath) {
		try {
			FileReader file1 = new FileReader(filepath);
			BufferedReader reader = new BufferedReader(file1);
			String line = "";
			int n = 0;
			int sum = 0;
			while((line = reader.readLine()) != null) {
				int num = Integer.parseInt(line);
				sum += num; 
				n++;
			}
			reader.close();
			file1.close();
			
			double mean = sum / n;
			
			FileWriter file2 = new FileWriter(filepath, true);
			PrintWriter filePrinter = new PrintWriter(file2);		
			filePrinter.println("\nTotal Score: " + sum + "\nMean of the scores: " + mean);
			
			filePrinter.close();
			file2.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
