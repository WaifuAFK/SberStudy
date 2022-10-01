package Homework.Part3;

/*
Даны положительные натуральые числа m и n. Найти остаток от деления m на
n, не выполняя операцию взятия остатка.

Сделать цикл и буферную переменную.
 */

import java.util.Scanner;

public class Part3Number5 {
    public static void main(String[] args) {
        int n, m, k;
        k = 0;
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        if (n > m)
            System.out.println(m);
        else if (n == m)
            System.out.println(0);
        else {
            while (m >= n) {
                m -= n;
                k++;
            }
            System.out.println(k);
        }
    }
}
