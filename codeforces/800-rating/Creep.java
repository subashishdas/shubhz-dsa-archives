import java.util.Scanner;

public class Creep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int a = sc.nextInt(); // Number of zeroes
            int b = sc.nextInt(); // Number of ones

            StringBuilder result = new StringBuilder();

            // Alternate '0' and '1'
            while (a > 0 && b > 0) {
                result.append('0');
                result.append('1');
                a--;
                b--;
            }

            // Append remaining zeroes
            while (a > 0) {
                result.append('0');
                a--;
            }

            // Append remaining ones
            while (b > 0) {
                result.append('1');
                b--;
            }

            System.out.println(result.toString());
        }
        sc.close();
    }
}