import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int lastDigit = n % 10;
        if (lastDigit <= 5) {
            n -= lastDigit; // Round down
        } else {
            n += (10 - lastDigit); // Round up
        }
        System.out.println(n);
        in.close();
    }
}
