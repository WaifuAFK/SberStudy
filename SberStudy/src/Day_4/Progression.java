package Day_4;

/*


Напишите программу, которая вычисляет 1 + 2 + 3 + ... + (n - 1) + n, где n — исходное значение.
Добавьте после тела цикла предложение if, которое сравнивает полученное значение с (n * (n + 1)) / 2 и
отображает сообщение, указывающее, являются ли эти выражения эквивалентными или нет.

Как вы думаете, какое сообщение будет отображено?

 */

import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {

        int n, sum, i;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите n для вычисления суммы 1 + 2 + 3 + ... + n: ");
        n = input.nextInt();

        i = 0;
        sum = 0;
        while (i < n) {
            i = i + 1;
            sum = sum + i;
        }

        System.out.println("Сумма целых чисел от 1 до " + n + " равна " + sum);
        if (sum == (n * (n + 1)) / 2)
            System.out.print("Это эквивалентно ");  // сообщение №1
        else
            System.out.print("Это не эквивалентно ");  // сообщение №2
        System.out.print("(n * (n + 1)) / 2 для n, равного " + n);
    }
}
