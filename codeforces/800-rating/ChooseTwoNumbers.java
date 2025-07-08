import java.util.Scanner;
import java.util.Arrays;

public class ChooseTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array A
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Read array B
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        // Find the maximum element in array A
        int maxA = 0; // Initialize with a value smaller than any possible positive integer
        if (n > 0) {
            maxA = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] > maxA) {
                    maxA = a[i];
                }
            }
        }

        // Alternatively, use Arrays.stream().max().getAsInt()
        // int maxA = Arrays.stream(a).max().getAsInt();

        // Find the maximum element in array B
        int maxB = 0; // Initialize with a value smaller than any possible positive integer
        if (m > 0) {
            maxB = b[0];
            for (int i = 1; i < m; i++) {
                if (b[i] > maxB) {
                    maxB = b[i];
                }
            }
        }

        // Alternatively, use Arrays.stream().max().getAsInt()
        // int maxB = Arrays.stream(b).max().getAsInt();

        // Print the two chosen numbers
        System.out.println(maxA + " " + maxB);

        sc.close();
    }
}