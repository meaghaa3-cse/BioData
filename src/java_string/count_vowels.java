package java_string ;
import java.util.Scanner;

public class count_vowels {
public static void main(String x[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String s = sc.nextLine();
	int count = 0;
	for(int i = 0;i < s.length();i++) {
		char ch = Character.toLowerCase(s.charAt(i));
		if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u')
			count++;
		
	}
	System.out.println("No of vowels:"+count);
}
}
