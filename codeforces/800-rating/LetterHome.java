import java.util.*;

public class LetterHome {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = scanner.nextInt();
            }
            int min = x[0];
            int max = x[n - 1];
            if (s <= min) {
                System.out.println(max - s);
            } else if (s >= max) {
                System.out.println(s - min);
            } else {
                System.out.println((max - min) + Math.min(s - min, max - s));
            }
        }
        scanner.close();
    }
}
