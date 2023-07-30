import java.util.*;
import java.util.Scanner;
public class jollyjumper {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] ans = new int[n - 1];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i++) {
            ans[i - 1] = Math.abs(a[i] - a[i - 1]);
        }

        Arrays.sort(ans);

        for (int i = 0; i < n - 1; i++) {
            if (i + 1 != ans[i]) {
                System.out.println("Not Jolly");
                return;
            }
        }
        System.out.println("Jolly");
    }
}
