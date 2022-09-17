package Homework.Part2;

/*
Петя пришел домой и помогает дочке решать математику. Ей нужно
определить, принадлежит ли точка с указанными координатами первому
квадранту. Недолго думая, Петя решил автоматизировать процесс и написать
программу: на вход нужно принимать два целых числа (координаты точки),
выводить true, когда точка попала в квадрант и false иначе.
Но сначала Петя вспомнил, что точка лежит в первом квадранте тогда, когда её
координаты удовлетворяют условию: x > 0 и y > 0.
Ограничения:
-100 < x, y < 100
 */

import java.util.Scanner;

public class Part2Number2 {
    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        if (x > 0 && y > 0)
            System.out.println(true);
        else
            System.out.println(false);

    }
}
