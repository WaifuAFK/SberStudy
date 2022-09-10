package Homework;

/*
На вход подается два целых числа a и b. Вычислите и выведите среднее
квадратическое a и b.

Среднее квадратическое значение множества заданных чисел определяется как число
равное квадратному корню от суммы квадратов этих чисел, делённой на их количество:
 */

import java.util.Scanner;

public class Part1Number2 {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2));
    }
}
