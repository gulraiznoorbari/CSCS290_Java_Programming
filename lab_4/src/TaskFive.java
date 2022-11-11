package lab;

public class TaskFive {

	public static void main(String[] args) {
		String word = "password";
		frequencyCounter(word);
	}
	
	public static void frequencyCounter(String word) {
		int[] frequency = new int[word.length()]; 
		
		//Converts given string into character array 
		char string[] = word.toCharArray();
		
		for (int i = 0; i < word.length(); i++) {    
			frequency[i] = 1;    
	        for(int j = i + 1; j < word.length(); j++) {    
	            if(string[i] == string[j]) {    
	            	frequency[i]++;
	            	string[j] = '0';
	            }    
	        }    
	    }
		
		System.out.println("Characters and their corresponding frequencies: ");
		int max = frequency[0];
		char maxChar = 'a';
		for (int i = 0; i < frequency.length; i++) {    
            if(string[i] != ' ' && string[i] != '0') {    
                System.out.println(word.charAt(i) + "-" + frequency[i]);  
            }
            if (frequency[i] > max) {
                max = frequency[i];
                maxChar = word.charAt(i);
            }
        }
		System.out.format("\nMax Occurimg Character is %c: %d", maxChar, max);         
	}
}
