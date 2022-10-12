package Homework.Number2.Part2;

/*
На вход подается число N. Необходимо посчитать и вывести на экран сумму его
цифр. Решить задачу нужно через рекурсию.
 */

import java.util.Scanner;

public class N2Part2Number8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(numberSum(N));
    }

    public static int numberSum(int Number) {
        if (Number < 10) {
            return Number;
        }

        return Number % 10 + numberSum(Number / 10);
    }

}
