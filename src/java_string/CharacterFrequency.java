
package java_string;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            if (s.charAt(i) == ' ')
                continue;

            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j))
                    found = true;
            }

            if (found)
                continue;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }

            System.out.println(s.charAt(i) + " = " + count);
        }

        sc.close();
    }
}
