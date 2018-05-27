import java.util.Date;
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

        Date today = new Date();
        System.out.printf("Today is: %tA, %tB %td, %tY", today, today, today, today);
        System.out.println();
        System.out.format("Today is: %tc", today);
        System.out.println();
        System.err.printf("Today is: %tD", today);

    }
}
