package java_string;
import java.util.Scanner;

public class palindrome {
public static void main(String x[])
{
	System.out.println("enter the string:");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String n = s;
	String rev = new StringBuilder(s).reverse().toString();
	System.out.println("Reversed string:" + rev);
	if(n.equals( rev))
		System.out.println("yes");
	else
		System.out.println("No");
}
}