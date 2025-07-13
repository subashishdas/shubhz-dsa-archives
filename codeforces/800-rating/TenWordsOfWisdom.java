import java.util.Scanner;

public class TenWordsOfWisdom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int maxWord = -1;
            int index = -1;

            for (int i = 0; i < n; i++) {
                int s = in.nextInt();
                int r = in.nextInt();

                // Only consider when rating <= 10
                if (s <= 10 && r > maxWord) {
                    maxWord = r;
                    index = i + 1;
                }
            }
            System.out.println(index);
        }
        in.close();
    }
}
