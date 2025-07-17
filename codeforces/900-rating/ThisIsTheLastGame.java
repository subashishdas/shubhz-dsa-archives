import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ThisIsTheLastGame {
    static class Venue {
        long minCoins, maxCoins, prize;

        Venue(long min, long max, long reward) {
            this.minCoins = min;
            this.maxCoins = max;
            this.prize = reward;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        while (testCases-- > 0) {
            int numVenues = in.nextInt();
            long playerCoins = in.nextLong();

            Venue[] venues = new Venue[numVenues];
            for (int i = 0; i < numVenues; i++) {
                long min = in.nextLong();
                long max = in.nextLong();
                long reward = in.nextLong();
                venues[i] = new Venue(min, max, reward);
            }

            // Sort by minimum coins required
            Arrays.sort(venues, (a, b) -> Long.compare(a.minCoins, b.minCoins));

            long currentMoney = playerCoins;
            int venueIndex = 0;

            // Max heap to store available prizes
            PriorityQueue<Long> prizes = new PriorityQueue<>(Collections.reverseOrder());

            while (true) {
                // Add all venues we can enter with current money
                while (venueIndex < numVenues && venues[venueIndex].minCoins <= currentMoney) {
                    prizes.add(venues[venueIndex].prize);
                    venueIndex++;
                }

                // Remove prizes that won't increase our money
                while (!prizes.isEmpty() && prizes.peek() <= currentMoney) {
                    prizes.poll();
                }

                // If no profitable venues left, we're done
                if (prizes.isEmpty()) {
                    break;
                }

                // Take the best prize available
                currentMoney = prizes.poll();
            }

            System.out.println(currentMoney);
        }

        in.close();
    }
}
