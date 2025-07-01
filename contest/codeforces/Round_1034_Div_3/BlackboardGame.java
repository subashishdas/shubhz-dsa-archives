package contest.codeforces.Round_1034_Div_3;

import java.util.Scanner;

public class BlackboardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int n = scanner.nextInt();

            // Bob wins if n is even, Alice wins if n is odd
            // This is because Bob can always mirror Alice's moves when n is even,
            // and Alice can always mirror Bob's moves when n is odd
            if (n % 4 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }

        scanner.close();
    }
}
