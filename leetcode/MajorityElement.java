import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int result = majorityElement(arr);
        int result2 = optimizedMajorityElement(arr);
        System.out.println("brute force " + result);
        System.out.println("optimized force " + result2);

    }

    public static int majorityElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }
        return -1;
    }

    public static int optimizedMajorityElement(int[] arr) {
        int n = arr.length;
        int count = 1;
        int element = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] == element) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    element = arr[i];
                    count = 1;
                }
            }

        }
        count = 0;
        for (int el : arr) {
            if (el == element) {
                count++;
            }
        }
        return (count > n / 2) ? element : -1;
    }
}
