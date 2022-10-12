package Homework.Number2.Part2;

/*
На вход подается число N. Необходимо вывести цифры числа справа налево.
Решить задачу нужно через рекурсию.
 */

import java.util.Scanner;

public class N2Part2Number10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(numberSout(N));
    }

    public static int numberSout(int Number) {
        if (Number < 10) {
            return Number;
        } else {
            System.out.print(Number % 10 + " ");
            return numberSout(Number / 10);
        }
    }
}
