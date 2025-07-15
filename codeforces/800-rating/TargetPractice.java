import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();

        while (t-- > 0) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                String row = in.nextLine();
                for (int j = 0; j < 10; j++) {
                    if (row.charAt(j) == 'X') {
                        // Distance from nearest edge
                        int distFromEdge = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j));
                        int points = distFromEdge + 1;
                        total += points;
                    }
                }
            }
            System.out.println(total);
        }
        in.close();
    }
}
