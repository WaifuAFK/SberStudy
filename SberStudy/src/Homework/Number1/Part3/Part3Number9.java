package Homework.Number1.Part3;

/*
На вход последовательно подается возрастающая последовательность из n
целых чисел, которая может начинаться с отрицательного числа.

Посчитать и вывести на экран, какое количество отрицательных чисел было
введено в начале последовательности. Помимо этого нужно прекратить
выполнение цикла при получении первого неотрицательного числа на вход.

Ограничения:
0 < n < 1000
-1000 < ai < 1000

 */

import java.util.Scanner;

public class Part3Number9 {
    public static void main(String[] args) {
        int n, buff;
        int minus = 0;
        Scanner sc = new Scanner(System.in);

        do {
            buff = sc.nextInt();
            if (buff > 0)
                break;
            else minus += 1;
        } while (true);

        System.out.println(minus);
    }
}
