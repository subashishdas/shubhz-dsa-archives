import java.util.Scanner;

public class ArrayEversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int maxSuffix = arr[n - 1];
            int operations = 0;
            int i = n - 2;
            while (i >= 0) {
                if (arr[i] > maxSuffix) {
                    operations++;
                    maxSuffix = arr[i];
                }
                i--;
            }
            System.out.println(operations);
        }

        in.close();
    }
}
