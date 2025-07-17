import java.util.*;

public class WillDefinatelyMakeIt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int heightIndex = arr[k - 1];
            int maximumHeight = findMaximumValue(arr);

            if (heightIndex == maximumHeight) {
                System.out.println("YES");
                continue;
            }

            List<Integer> uniqueHeight = createSortedUnique(arr);
            int refPos = findPositionInSortedArray(uniqueHeight, heightIndex);
            boolean canAchieve = validateHeightGaps(uniqueHeight, refPos, heightIndex);

            if (canAchieve) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        in.close();
    }

    public static int findMaximumValue(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static List<Integer> createSortedUnique(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for (int val : arr) {
            set.add(val);
        }
        return new ArrayList<>(set);
    }

    public static int findPositionInSortedArray(List<Integer> sortedList, int target) {
        for (int i = 0; i < sortedList.size(); i++) {
            if (sortedList.get(i) >= target) {
                return i;
            }
        }
        return sortedList.size();
    }

    public static boolean validateHeightGaps(List<Integer> sortedList, int start, int maxAllowedGap) {
        for (int i = start; i + 1 < sortedList.size(); i++) {
            int currHeight = sortedList.get(i);
            int nextHeight = sortedList.get(i + 1);
            int gapSize = nextHeight - currHeight;
            if (gapSize > maxAllowedGap) {
                return false;
            }
        }
        return true;
    }
}
