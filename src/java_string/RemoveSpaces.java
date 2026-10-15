
package java_string;
import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        s = s.replace(" ", "");

        System.out.println("Result: " + s);
        sc.close();
    }
}
