import java.util.Scanner;

public class ChipsMoving {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Read the positions of the chips
        int[] chips = new int[n];
        for (int i = 0; i < n; i++) {
            chips[i] = in.nextInt();
        }

        // Count the number of chips at even and odd positions
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (chips[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // The minimum number of steps is the minimum of the counts of even and odd
        // positions
        System.out.println(Math.min(evenCount, oddCount));
        in.close();
    }
}
