package Homework.Number1.Part3;

/*
На вход подается:
○ целое число n,
○ целое число p
○ целые числа a1, a2 , … an
Необходимо вычислить сумму всех чисел a1, a2, a3 … an которые строго
больше p
 */

import java.util.Scanner;

public class Part3Number8 {
    public static void main(String[] args) {
        int n, p;
        int sum = 0;
        int buff = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        p = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            buff = sc.nextInt();
            if (buff > p)
                sum += buff;
        }

        System.out.println(sum);
    }
}
