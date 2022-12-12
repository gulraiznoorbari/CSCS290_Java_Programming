package TaskFive;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		AddEmployee();
	}
	
	private static void AddEmployee() {
		
		ArrayList<Manager> managers = new ArrayList<>();
		ArrayList<Waiter> waiters = new ArrayList<>();
		Scanner scannyboi = new Scanner(System.in);

        String sentinel = "no";
        Manager m;
        Waiter w;

        while (!sentinel.equals("yes")) {
            System.out.println("Enter name: ");
            String name = scannyboi.nextLine();
            
            System.out.println("Enter address: ");
            String address = scannyboi.nextLine();
            
            System.out.println("Enter contact: ");
            String contact = scannyboi.nextLine();
            
            System.out.println("Enter email: ");
            String email = scannyboi.nextLine();
            
            System.out.println("Enter salary: ");
            String salary = scannyboi.nextLine();
            
            System.out.println("Enter type: ");
            String type = scannyboi.nextLine();
         
            if (type.equals("manager")) {
                managers.add(m = new Manager(name, address, contact, email, salary, type));
            } else if (type.equals("waiter")) {
                waiters.add(w = new Waiter(name, address, contact, email, salary, type));
            }
            
            System.out.println("Do you want to stop? (yes/no)");
            sentinel = scannyboi.nextLine();
            if (sentinel == "yes") {
            	break;
            }
        }
        
        System.out.println();
        for (Manager manager : managers) {
            System.out.println();
        	System.out.println("Name: " + manager.geteName());
            System.out.println("Contact: " + manager.geteContact());
            System.out.println("Address: " + manager.geteAddress());
            System.out.println("Email: " + manager.getmEmail());
            System.out.println("Salary: " + manager.getmSalary());
            System.out.println("Type: " + manager.geteType());
        }
        
        for (Waiter waiter : waiters) {
            System.out.println();
        	System.out.println("Name: " + waiter.geteName());
            System.out.println("Contact: " + waiter.geteContact());
            System.out.println("Address: " + waiter.geteAddress());
            System.out.println("Email: " + waiter.getmEmail());
            System.out.println("Salary: " + waiter.getmSalary());
            System.out.println("Type: " + waiter.geteType());
        }
	}

}
