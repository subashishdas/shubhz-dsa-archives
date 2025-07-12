import java.util.Scanner;

public class CardsForFriends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int w = in.nextInt();
            int h = in.nextInt();
            int n = in.nextInt();

            int count = 1;

            while (w % 2 == 0) {
                w = w / 2;
                count *= 2;
                System.out.println("width " + w);
                System.out.println("count" + count);
            }
            while (h % 2 == 0) {
                h = h / 2;
                count *= 2;
                System.out.println("height " + h);
                System.out.println("count" + count);
            }

            if (count >= n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        in.close();
    }
}
