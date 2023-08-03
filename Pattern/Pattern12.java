package Pattern;
import java.util.*;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || j == n || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
