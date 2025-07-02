
import java.util.Scanner;

public class CaluclatingFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        long result = 0;

        if (n % 2 == 0) {
            result = n / 2;
        } else {
            result = -((n + 1) / 2);
        }
        System.out.println(result);
        in.close();
    }
}
