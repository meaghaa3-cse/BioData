
package java_string;

import java.util.Scanner;

public class replace_vowels {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                s = s.replace(s.charAt(i), '*');
            }
        }

        System.out.println(s);
        sc.close();
    }
}
