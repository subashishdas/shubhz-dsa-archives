import java.util.Arrays;
import java.util.Scanner;

public class DesignTutorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] compositeNumbers = findCompositeNumbers(n);

        for (int i = 0; i < compositeNumbers.length; i++) {
            int num1 = compositeNumbers[i];
            int num2 = n - num1;
            if (num2 > 1 && isComposite(num2)) {
                System.out.println(num1 + " " + num2);
                return;
            }
        }
    }

    public static int[] findCompositeNumbers(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        int[] composites = new int[limit];
        int count = 0;
        for (int i = 4; i <= limit; i++) {
            if (!isPrime[i]) {
                composites[count++] = i;
            }
        }

        return Arrays.copyOfRange(composites, 0, count);
    }

    public static boolean isComposite(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return true;
        }
        return false;
    }
}
