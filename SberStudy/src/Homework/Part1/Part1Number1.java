package Homework.Part1;

/*
 Задание:

Вычислите и выведите на экран объем шара, получив его радиус r с консоли.
Подсказка: считать по формуле V = 4/3 * pi * r^3. Значение числа pi взять из
Math.

 */

import java.util.Scanner;

public class Part1Number1 {
    public static void main(String[] args) {
        double r, V;

        Scanner input = new Scanner(System.in);
        r = input.nextDouble();

        V = 4 / 3.0 * Math.PI * Math.pow(r, 3);

        System.out.println(V);
    }
}
