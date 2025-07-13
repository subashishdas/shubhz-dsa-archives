import java.util.Scanner;

public class WeNeedTheZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];

            int allXor = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                allXor ^= arr[i];
            }

            if (n % 2 == 1) {
                System.out.println(allXor);
            } else {
                System.out.println(allXor == 0 ? 0 : -1);
            }
        }
        in.close();
    }
}
