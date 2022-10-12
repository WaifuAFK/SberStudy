package Homework.Number2.Part2;

/*
На вход подается число N. Необходимо вывести цифры числа слева направо.
Решить задачу нужно через рекурсию
 */

import java.util.Scanner;

public class N2Part2Number9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(numberSout(N));
    }

    public static String numberSout(int Number) {
        if (Number < 10) {
            return Integer.toString(Number);
        } else {
            return numberSout(Number / 10) + " " + Number % 10;
        }
    }
}
