package Praktikum.August24;

/*
Даны два числа a и b . Проверить утверждение, что только одно из них нечетное.
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        if (firstNumber % 2 != 0 ^ secondNumber % 2 != 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
