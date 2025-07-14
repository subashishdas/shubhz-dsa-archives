
import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            in.nextLine();
            String s = in.nextLine();
            int[] freq = new int[26];
            for (char c : s.toCharArray())
                freq[c - 'a']++;
            int cntOdd = 0;
            for (int f : freq)
                if (f % 2 != 0)
                    cntOdd++;
            System.out.println(cntOdd <= k + 1 ? "YES" : "NO");
        }
        in.close();
    }
}
