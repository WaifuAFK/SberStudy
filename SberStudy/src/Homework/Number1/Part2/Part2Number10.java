package Homework.Number1.Part2;
/*
Напишите программу, которая проверяет, что log(e^n) == n для любого
вещественного n.

Ограничения:
-500 < n < 50
 */

import java.util.Scanner;

public class Part2Number10 {
    public static void main(String[] args) {
        double n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextDouble();

        if (Math.log(Math.pow(Math.E, n)) == n)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
