import java.util.*;

public class AddOrXor {

    static final long MAX_COST = (1L << 60);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        while (testCases-- > 0) {
            int start = input.nextInt();
            int end = input.nextInt();
            long incCost = input.nextLong();
            long toggleCost = input.nextLong();

            int limit = Math.max(start, end) + 3;

            long[] minCost = new long[limit];
            Arrays.fill(minCost, MAX_COST);
            minCost[start] = 0;

            PriorityQueue<State> heap = new PriorityQueue<>();
            heap.add(new State(0, start));

            while (!heap.isEmpty()) {
                State current = heap.poll();
                long currCost = current.totalCost;
                int position = current.pos;

                if (currCost > minCost[position])
                    continue;
                if (position == end)
                    break;

                // Option 1: Move to next position
                if (position + 1 < limit) {
                    long newCost = currCost + incCost;
                    if (newCost < minCost[position + 1]) {
                        minCost[position + 1] = newCost;
                        heap.add(new State(newCost, position + 1));
                    }
                }

                // Option 2: Toggle LSB using XOR
                int toggled = position ^ 1;
                if (toggled >= 0 && toggled < limit) {
                    long newCost = currCost + toggleCost;
                    if (newCost < minCost[toggled]) {
                        minCost[toggled] = newCost;
                        heap.add(new State(newCost, toggled));
                    }
                }
            }

            long answer = minCost[end];
            System.out.println(answer == MAX_COST ? -1 : answer);
        }
    }

    // Custom class to represent the state in the priority queue
    static class State implements Comparable<State> {
        long totalCost;
        int pos;

        State(long cost, int position) {
            this.totalCost = cost;
            this.pos = position;
        }

        public int compareTo(State other) {
            return Long.compare(this.totalCost, other.totalCost);
        }
    }
}
