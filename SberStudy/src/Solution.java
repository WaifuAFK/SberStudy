import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int x = 0; x < n - i - 1; x++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int j = 0; j < n - 1 ; j++) {
            System.out.print(" ");
        }
        System.out.print("|");
    }
}
