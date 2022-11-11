package lab;

public class TaskOne {

	public static void main(String[] args) {
		String password = "helloworld1223";
		isValid(password);
		
	}
	
	public static void isValid(String password) {
		int digitcount = 0;
		if (password.length() >= 10) {
			for (int y = 0; y < password.length(); y++) {
				if(Character.isDigit(password.charAt(y))) {
					digitcount++;
				}
			}
			if (digitcount >= 2) 
				System.out.println("Password is valid");
			else
				System.out.println("Password is invalid");
		}
		else {
			System.out.println("Password is invalid");
		}
	}

}
