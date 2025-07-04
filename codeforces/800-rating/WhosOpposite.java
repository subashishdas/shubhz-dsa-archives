import java.util.Scanner;

public class WhosOpposite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            int n = Math.abs(a - b) * 2;

            // Check if any number is out of bounds
            if (a > n || b > n || c > n) {
                System.out.println(-1);
                continue;
            }

            int opposite;
            if (c + n / 2 <= n) {
                opposite = c + n / 2;
            } else {
                opposite = c - n / 2;
            }

            System.out.println(opposite);
        }

        in.close();
    }
}
