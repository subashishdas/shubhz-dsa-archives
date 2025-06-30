import java.util.Scanner;

public class PrefixRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();

        while (numTestCases-- > 0) {
            String inputString = scanner.next();
            int[] charFrequency = new int[26];

            // Count the frequency of each character in the input string
            for (char c : inputString.toCharArray()) {
                charFrequency[c - 'a']++;
            }

            // Find the last occurrence of each character
            int lastOccurrence = 0;
            for (char c : inputString.toCharArray()) {
                charFrequency[c - 'a']--;
                if (charFrequency[c - 'a'] == 0) {
                    // This is the last occurrence of the character
                    lastOccurrence = lastOccurrence > c ? lastOccurrence : c;
                }
            }

            // Print the substring after the last occurrence
            System.out.println(inputString.substring(lastOccurrence + 1));
        }

        scanner.close();
    }
}
