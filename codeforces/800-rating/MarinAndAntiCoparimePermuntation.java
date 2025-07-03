import java.util.Scanner;

public class MarinAndAntiCoparimePermuntation {
    static int mod = 998244353;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();

            if (n % 2 != 0) {
                System.out.println(0); // If n is odd, no beautiful permutation exists
            } else {
                long result = factorial(n / 2);
                result = (result * result) % mod; // Square the result for both halves
                System.out.println(result);
            }
        }
        in.close();
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % mod;
        }
        return result;
    }
}
