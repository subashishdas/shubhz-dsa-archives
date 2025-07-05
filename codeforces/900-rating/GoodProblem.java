import java.util.Scanner;

public class GoodProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt();

        while (testCount-- > 0) {
            long bitCount = scanner.nextLong();
            long lowerBound = scanner.nextLong();
            long upperBound = scanner.nextLong();
            long constraint = scanner.nextLong();

            if (bitCount == 1) {
                System.out.println(lowerBound);
                continue;
            }

            if (bitCount % 2 == 1) {
                if (constraint <= bitCount) {
                    System.out.println(lowerBound);
                } else {
                    System.out.println("-1");
                }
                continue;
            }

            if (bitCount == 2) {
                System.out.println("-1");
                continue;
            }

            // Case: n is even and greater than 2
            long candidate = lowerBound;

            while (true) {
                boolean valid = true;

                for (int bit = 0; bit < 64; bit++) {
                    long bitMask = 1L << bit;

                    // if both l and candidate have this bit set
                    if ((lowerBound & bitMask) != 0 && (candidate & bitMask) != 0) {
                        // move to next valid number
                        candidate += bitMask;
                        candidate &= ~(bitMask - 1);
                        valid = false;
                        break;
                    }
                }

                if (valid)
                    break;
            }

            if (candidate > upperBound) {
                System.out.println("-1");
            } else {
                if (constraint <= bitCount - 2) {
                    System.out.println(lowerBound);
                } else {
                    System.out.println(candidate);
                }
            }
        }

        scanner.close();
    }
}
