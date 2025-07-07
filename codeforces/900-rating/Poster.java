import java.util.Scanner;

public class Poster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // total letters in slogan
        int k = sc.nextInt(); // initial position (1-based index)
        sc.nextLine(); // to consume the leftover newline
        String slogan = sc.nextLine();

        int currentPos = k - 1; // convert to 0-based index
        int totalMoves = 0;

        if (currentPos < n - k) {
            // LEFT is closer to start
            for (int i = 0; i < currentPos; i++) {
                System.out.println("LEFT");
                totalMoves++;
            }
            System.out.println("PRINT " + slogan.charAt(0));
            totalMoves++;

            // Move right and print rest
            for (int i = 1; i < n; i++) {
                System.out.println("RIGHT");
                totalMoves++;
                System.out.println("PRINT " + slogan.charAt(i));
                totalMoves++;
            }
        } else {
            // RIGHT is closer to end
            for (int i = 0; i < n - k; i++) {
                System.out.println("RIGHT");
                totalMoves++;
            }
            System.out.println("PRINT " + slogan.charAt(n - 1));
            totalMoves++;

            // Move left and print rest
            for (int i = n - 2; i >= 0; i--) {
                System.out.println("LEFT");
                totalMoves++;
                System.out.println("PRINT " + slogan.charAt(i));
                totalMoves++;
            }
        }

        // Optional: print total moves
        // System.out.println("Total moves: " + totalMoves);
    }
}
