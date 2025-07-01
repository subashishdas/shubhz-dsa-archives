package contest.codeforces.Round_1034_Div_3;

import java.util.Scanner;

public class PrefixMinAndSuffixMax {

    public static void main(String[] args) {
        // Create a scanner object to read from the standard input
        Scanner in = new Scanner(System.in);

        // Read the number of test cases
        int testCases = in.nextInt();

        // Process each test case
        while (testCases-- > 0) {
            // Read the size of the array
            int n = in.nextInt();

            // Read the elements of the array
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            // Process the array and compute the desired result
            String result = processArray(a, n);

            // Print the result
            System.out.println(result);
        }

        // Close the scanner to free up resources
        in.close();
    }

    public static String processArray(int[] arr, int n) {
        // Compute the prefix minimums
        int[] leftMin = calculatePrefixMin(arr, n);

        // Compute the suffix maximums
        int[] rightMax = calculateSuffixMax(arr, n);

        // Create a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();

        // Iterate over the array
        for (int i = 0; i < n; i++) {
            // Check if the current element is special
            boolean isSpecial = checkSpecialCondition(arr[i], leftMin[i], rightMax[i]);

            // Append the result to the StringBuilder
            result.append(isSpecial ? "1" : "0");
        }

        // Return the result string
        return result.toString();
    }

    public static int[] calculatePrefixMin(int[] arr, int n) {
        // Create an array to store the prefix minimums
        int[] prefixMin = new int[n];

        // Initialize the first element of the prefix minimums array
        // The first element is simply the first element of the input array
        prefixMin[0] = arr[0];

        // Iterate over the array and calculate the prefix minimums
        for (int i = 1; i < n; i++) {
            // Calculate the current prefix minimum
            // The current prefix minimum is the minimum of the previous prefix
            // minimum and the current element
            prefixMin[i] = Math.min(prefixMin[i - 1], arr[i]);
        }

        // Return the prefix minimums array
        return prefixMin;
    }

    public static int[] calculateSuffixMax(int[] arr, int n) {
        int[] suffixMax = new int[n];
        suffixMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], arr[i]);
        }
        return suffixMax;
    }

    public static boolean checkSpecialCondition(int num, int leftMin, int rightMax) {
        return num == leftMin || num == rightMax;
    }
}