/*
  Problem: Setting Up Camp (1945A)
🧠 Pattern: Greedy
🎯 Idea: Accommodate introverts in individual tents, group extroverts in groups of 3, and use universal tents to fill gaps.
*/

import java.util.Scanner;

public class SettingUpCamp {
    public static void main(String[] args) {
        // Create a Scanner object to read input from standard input
        Scanner in = new Scanner(System.in);

        // Read the number of test cases
        int t = in.nextInt();

        // Process each test case
        while (t-- > 0) {
            // Read the number of introverts, extroverts, and universal tents available
            int introverts = in.nextInt();
            int extroverts = in.nextInt();
            int univarsal = in.nextInt();

            // Initialize total tents with the number of introverts
            int totalTents = introverts;

            // Calculate the number of tents that extroverts can fully occupy in groups of 3
            totalTents += extroverts / 3;

            // Calculate the remaining extroverts after forming complete groups
            extroverts %= 3;

            // If there are remaining extroverts that can't form a complete group
            if (extroverts > 0) {
                // Use universal tents to make up for the shortage in forming a complete group
                univarsal -= (3 - extroverts);

                // Increment total tents as we used a universal tent
                totalTents++;
            }

            // Check if the universal tents are insufficient
            if (univarsal < 0) {
                // Output -1 if it's impossible to provide tents
                totalTents = -1;
            } else {
                // Add the number of complete groups of 3 that can be formed with universal
                // tents
                totalTents += (univarsal / 3);

                // Calculate remaining universal tents after forming groups
                univarsal %= 3;

                // If there are any remaining universal tents, add one more tent to total
                if (univarsal > 0) {
                    totalTents++;
                }
            }

            // Output the total number of tents needed
            System.out.println(totalTents);
        }

        // Close the Scanner to free resources
        in.close();
    }
}
