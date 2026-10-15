package java_string;
import java.util.Scanner;

public class reverse_string {
public static void main(String x[])
{
	System.out.println("enter the string:");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String rev = new StringBuilder(s).reverse().toString();
	System.out.println("Reversed string:" + rev);
}
}
