import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineSegments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int n = scanner.nextInt();

            long startX = scanner.nextLong();
            long startY = scanner.nextLong();
            long endX = scanner.nextLong();
            long endY = scanner.nextLong();

            List<Long> steps = new ArrayList<>();
            long totalSteps = 0;
            long maxStep = 0;

            for (int i = 0; i < n; i++) {
                long step = scanner.nextLong();
                steps.add(step);
                totalSteps += step;
                maxStep = Math.max(maxStep, step);
            }

            // Minimum possible reach = max(0, 2 * maxStep - total)
            long minReach = Math.max(0, 2 * maxStep - totalSteps);

            // Calculate square of Euclidean distance
            long dx = endX - startX;
            long dy = endY - startY;
            long squareDistance = dx * dx + dy * dy;

            boolean isReachable = squareDistance >= (minReach * minReach)
                    && squareDistance <= (totalSteps * totalSteps);
            System.out.println(isReachable ? "Yes" : "No");
        }

        scanner.close();
    }
}
