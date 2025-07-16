import java.util.Scanner;

public class Eraser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            in.nextLine();
            String s = in.nextLine();
            int moves = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'B') {
                    moves++;
                    i += k - 1;
                }

            }
            System.out.println(moves);
        }

        in.close();
    }
}
