package java_string;
import java.util.Scanner;
public class count_low_upp {
	
	

	public class count_vowels {
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		int count_u = 0;
		int count_l = 0;
		for(int i = 0;i < s.length();i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			if(Character.isUpperCase(ch) )
				count_u++;
			else if(Character.isLowerCase(ch))
				count_l++;
			}

		System.out.println("No of uppercase:"+count_u);
		System.out.println("No of uppercase:"+count_l);
		
	}
	}

}
