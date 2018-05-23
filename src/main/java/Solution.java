import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by ribake on 23/05/2018.
 */
public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);

        int i1 = scanner.nextInt();
        double d1 = scanner.nextDouble();
//        The below nextLine() will scan from just after the double and see only the line return
//        String line = scanner.nextLine();
//        String s1 = scanner.nextLine();
//        System.out.println(s + s1);

        String firstWord = scanner.next();
        String rest = scanner.nextLine();

        System.out.println(i + i1);
        System.out.println(d + d1);

        scanner.close();
    }
}
