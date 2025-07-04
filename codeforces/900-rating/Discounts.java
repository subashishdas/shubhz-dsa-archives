import java.util.Arrays;
import java.util.Scanner;

public class Discounts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        long totalCost = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            totalCost += arr[i];
        }
        Arrays.sort(arr);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int q = in.nextInt();
            System.out.println(totalCost - arr[n - q]);
        }

        in.close();
    }
}