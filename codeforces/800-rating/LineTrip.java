import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int x = in.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int maxGap = arr[0];
            for (int i = 1; i < n; i++) {
                maxGap = Math.max(maxGap, arr[i] - arr[i - 1]);
            }
            maxGap = Math.max(maxGap, 2 * (x - arr[n - 1]));
            System.out.println(maxGap);
        }
        in.close();
    }
}
