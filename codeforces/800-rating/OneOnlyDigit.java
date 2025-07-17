import java.util.Scanner;

public class OneOnlyDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int x = in.nextInt();
            String s = String.valueOf(x);
            int smallest = 9;

            for (char c : s.toCharArray()) {
                smallest = Math.min(smallest, c - '0');
            }
            System.out.println(smallest);
        }
    }
}
