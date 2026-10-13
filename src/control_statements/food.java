package control_statements;
import java.util.Scanner;

public class food {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("FOOD MENU");
	        System.out.println("1. Vegetables");
	        System.out.println("2. Fruits");
	        System.out.println("3. Non-Veg");
	        System.out.print("Enter your choice: ");

	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("Vegetables: Tomato, Potato, Carrot");
	                System.out.print("Enter item number (1-3): ");

	                switch (sc.nextInt()) {
	                    case 1 -> System.out.println("You selected Tomato");
	                    case 2 -> System.out.println("You selected Potato");
	                    case 3 -> System.out.println("You selected Carrot");
	                    default -> System.out.println("Invalid choice");
	                }
	                break;

	            case 2:
	                System.out.println("Fruits: Apple, Mango, Banana");
	                System.out.print("Enter item number (1-3): ");

	                switch (sc.nextInt()) {
	                    case 1 -> System.out.println("You selected Apple");
	                    case 2 -> System.out.println("You selected Mango");
	                    case 3 -> System.out.println("You selected Banana");
	                    default -> System.out.println("Invalid choice");
	                }
	                break;

	            case 3:
	                System.out.println("Non-Veg: Chicken, Fish, Mutton");
	                System.out.print("Enter item number (1-3): ");

	                switch (sc.nextInt()) {
	                    case 1 -> System.out.println("You selected Chicken");
	                    case 2 -> System.out.println("You selected Fish");
	                    case 3 -> System.out.println("You selected Mutton");
	                    default -> System.out.println("Invalid choice");
	                }
	                break;

	            default:
	                System.out.println("Invalid main choice");
	        }
	    }
}
