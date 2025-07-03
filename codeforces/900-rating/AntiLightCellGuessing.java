import java.util.Scanner;

public class AntiLightCellGuessing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read the number of test cases
        int t = in.nextInt();

        // Process each test case
        while (t-- > 0) {
            // Read the dimensions of the grid
            int n = in.nextInt(); // number of rows
            int m = in.nextInt(); // number of columns

            // Calculate the number of operations needed to win
            // If the grid is 1x1, no operations are needed
            if (n == 1 && m == 1) {
                System.out.println(0);
            }
            // If the grid has only one row or one column, one operation is needed
            else if (n == 1 || m == 1) {
                System.out.println(1);
            }
            // For larger grids, two operations are needed
            else {
                System.out.println(2);
            }
        }
    }
}