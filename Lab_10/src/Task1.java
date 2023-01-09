import java.io.*;

public class Task1 {

	public static void main(String[] args) {
		try 
		{
			FileReader f = new FileReader("hello.txt");
			BufferedReader file = new BufferedReader(f);
			int i;
			System.out.println("File Content:");
			while((i = file.read())!= -1) {  
	          System.out.print((char)i);  
	       }  
			file.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
