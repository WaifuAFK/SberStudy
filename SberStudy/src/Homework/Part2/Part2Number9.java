package Homework.Part2;

import java.util.Scanner;

/*
Пока Петя практиковался в работе со строками, к нему подбежала его
дочь и спросила: "А правда ли, что тригонометрическое тождество (sin^2(x)+
cos^2(x) - 1 == 0) всегда-всегда выполняется?"
Напишите программу, которая проверяет, что при любом x на входе
тригонометрическое тождество будет выполняться (то есть будет выводить true
при любом x).

Ограничения:
-1000 < x < 1000
 */
public class Part2Number9 {
    public static void main(String[] args) {
        double x;
        double result;
        Scanner sc = new Scanner(System.in);

        x = sc.nextDouble();

        result = Math.sin(Math.pow(x, 2)) + Math.cos(Math.pow(x, 2)) - 1;

        if ((int) result == 0) {
            System.out.println(true);
        } else
            System.out.println(false);

        System.out.println(result);
    }
}
