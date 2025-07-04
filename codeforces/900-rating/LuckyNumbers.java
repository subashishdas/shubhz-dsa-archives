import java.util.Scanner;

public class LuckyNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int l = in.nextInt();
            int r = in.nextInt();

            int bestNum = l;
            int bestDiff = -1;
            for (int i = l; i <= r; i++) {
                int x = i;
                int max = 0, min = 9;

                while (x > 0) {
                    int digit = x % 10;
                    max = Math.max(max, digit);
                    min = Math.min(min, digit);
                    x /= 10;
                }

                int diff = max - min;
                if (diff > bestDiff) {
                    bestNum = i;
                    bestDiff = diff;
                }
                if (bestDiff == 9)
                    break;
            }
            System.out.println(bestNum);
        }

        in.close();
    }
}