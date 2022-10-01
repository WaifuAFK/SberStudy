package Homework.Part3;

/*
На вход подается два положительных числа m и n. Найти сумму чисел между m
и n включительно.
 */

import java.util.Scanner;

public class Part3Number2 {
    public static void main(String[] args) {
        int n, m;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = n; i <= m; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
