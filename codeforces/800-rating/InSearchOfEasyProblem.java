import java.util.Scanner;

public class InSearchOfEasyProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            if (in.nextInt() == 1) {
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");

    }
}
