package Homework.Number1.Part2;

/*
Дома дочери Пети опять нужна помощь с математикой! В этот раз ей
нужно проверить, имеет ли предложенное квадратное уравнение решение или
нет.
На вход подаются три числа — коэффициенты квадратного уравнения a, b, c.
Нужно вывести "Решение есть", если оно есть и "Решения нет", если нет.

Ограничения:
-100 < a, b, c < 100

Если D < 0 – то квадратное уравнение не имеет решений
D = b2 − 4ac

 */

import java.util.Scanner;

public class Part2Number5 {
    public static void main(String[] args) {
        int a, b, c;
        double d;

        Scanner sc = new Scanner(System.in);

         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();

         d = Math.pow(b, 2) - 4 * a * c;

         if (d < 0)
             System.out.println("Решения нет");
         else
             System.out.println("Решение есть");
    }
}
