import java.util.Scanner;

public class QurikyQuantifires {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

        in.close();
    }
}
