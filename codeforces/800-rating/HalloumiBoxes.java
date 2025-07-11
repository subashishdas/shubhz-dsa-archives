import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            if (k >= 2) {
                System.out.println("Yes");
            } else {
                boolean isSorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        isSorted = false;
                        break;
                    }
                }
                if (isSorted) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }
        in.close();
    }

}
