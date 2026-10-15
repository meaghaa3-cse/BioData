
package java_string;

import java.util.Scanner;

public class first_uppercase {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        String result = s.substring(0, 1).toUpperCase() + s.substring(1);

        System.out.println("Result: " + result);

        sc.close();
    }
}
