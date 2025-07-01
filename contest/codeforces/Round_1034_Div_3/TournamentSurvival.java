package contest.codeforces.Round_1034_Div_3;

import java.util.Scanner;

public class TournamentSurvival {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // number of players
            int j = sc.nextInt(); // player j (1-based index)
            int k = sc.nextInt(); // number of players to remain

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int strengthJ = a[j - 1]; // player j's strength
            int maxStrength = findMaxStrength(a); // find the maximum strength

            if (k > 1 || strengthJ == maxStrength) {
                // If k > 1, player j can always survive
                // If player j has the maximum strength, they can also survive
                System.out.println("Yes");
            } else {
                // If player j does not have the maximum strength and k == 1,
                // they cannot survive
                System.out.println("No");
            }
        }

        sc.close();
    }

    public static int findMaxStrength(int[] arr) {
        int maxStrength = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxStrength) {
                maxStrength = arr[i];
            }
        }
        return maxStrength;
    }

}
