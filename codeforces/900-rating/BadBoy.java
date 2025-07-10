import java.util.Scanner;

public class BadBoy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            long m = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();

            long xc1 = 1;
            long yc1 = 1;
            long dist1 = Math.abs(x - xc1) + Math.abs(y - yc1);

            long xc2 = 1;
            long yc2 = m;
            long dist2 = Math.abs(x - xc2) + Math.abs(y - yc2);

            long xc3 = n;
            long yc3 = 1;
            long dist3 = Math.abs(x - xc3) + Math.abs(y - yc3);

            long xc4 = n;
            long yc4 = m;
            long dist4 = Math.abs(x - xc4) + Math.abs(y - yc4);

            long min = Math.min(dist3 + dist2, dist1 + dist4);
            long x1 = 0, x2 = 0, y1 = 0, y2 = 0, min2 = 0;
            if (min == dist1 + dist4) {
                x1 = xc1;
                y1 = yc1;
                x2 = xc4;
                y2 = yc4;
            }
            if (min == dist2 + dist3) {
                x1 = xc2;
                y1 = yc2;
                x2 = xc3;
                y2 = yc3;
            }

            System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
        }
    }
}