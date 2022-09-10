package Day_5;

/*
Напишите программу, которая запрашивает у пользователя числовые значения, а выводит количество
положительных и количество отрицательных введенных значений.

Подсказка: в качестве значения сигнальной метки используйте 0.

 */

import java.util.Scanner;

public class PositiveAndNegativeNumbers {
    public static void main(String[] args) {

        System.out.println("Введите через пробел положительные и отрицательные значения, введите 0, чтобы закончить");
        int number;
        int positive = 0;
        int negative = 0;

        Scanner sc = new Scanner(System.in);

        for (number = sc.nextInt(); number != 0; number = sc.nextInt()) {
            if (number > 0)
                positive++;
            else if (number < 0)
                negative++;
            else break;
        }

        System.out.println(positive + " положительных");
        System.out.println(negative + " отрицательных");

    }
}
