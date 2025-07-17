import java.util.*;

public class NoCasinoInMountains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int hikes = 0;
            int i = 0;
            
            while (i <= n - k) {
                // Check if we can start a hike at day i
                boolean canHike = true;
                for (int j = i; j < i + k; j++) {
                    if (a[j] == 1) {
                        canHike = false;
                        break;
                    }
                }
                
                if (canHike) {
                    hikes++;
                    i += k + 1; // Skip k days for hike + 1 day mandatory break
                } else {
                    i++; // Move to next day
                }
            }
            
            System.out.println(hikes);
        }
        
        sc.close();
    }
}