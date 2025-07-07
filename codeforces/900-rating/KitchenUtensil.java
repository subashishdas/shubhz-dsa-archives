import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KitchenUtensil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] utensils = new int[n];
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            utensils[i] = scanner.nextInt();
            counts.put(utensils[i], counts.getOrDefault(utensils[i], 0) + 1);
        }
        int maxCount = 0;
        for (int count : counts.values()) {
            maxCount = Math.max(maxCount, count);
        }
        int setsNeeded = (maxCount + k - 1) / k;
        int stolenUtensils = setsNeeded * k * counts.size() - n;
        System.out.println(stolenUtensils);
        scanner.close();
    }
}
