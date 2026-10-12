package operator;
import java.util.Scanner;
public class AreaOfShapes {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter rectangle length and breadth: ");
	        double l = sc.nextDouble();
	        double b = sc.nextDouble();
	        System.out.println("Rectangle area = " + (l * b));

	        System.out.print("Enter square side: ");
	        double side = sc.nextDouble();
	        System.out.println("Square area = " + (side * side));

	        System.out.print("Enter circle radius: ");
	        double r = sc.nextDouble();
	        System.out.println("Circle area = " + (Math.PI * r * r));

}
}
