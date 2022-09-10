package Homework;

/*
На вход подается баланс счета в банке – n. Рассчитайте дневной бюджет на 30
дней.
 */

import java.util.Scanner;

public class Part1Number8 {
    public static void main(String[] args) {
        double n;

        Scanner input = new Scanner(System.in);
        n = input.nextDouble();

        System.out.println(n / 30);
    }
}
