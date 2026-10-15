
package java_string;

import java.util.Scanner;

public class word_count {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String s = sc.nextLine();

        String[] words = s.split(" ");

        System.out.println("No of words: " + words.length);

       
    }
}
