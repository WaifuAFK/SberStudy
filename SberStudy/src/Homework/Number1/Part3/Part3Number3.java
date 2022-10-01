package Homework.Number1.Part3;

/*
На вход подается два положительных числа m и n. Необходимо вычислить m^1
+ m^2 + ... + m^n
 */

import java.util.Scanner;

public class Part3Number3 {
    public static void main(String[] args) {
        int n, m;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            sum += Math.pow(m, i);
        }

        System.out.println(sum);
    }
}
