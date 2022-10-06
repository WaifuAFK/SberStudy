package Praktikum.August24;

/*
Дано четырехзначное число. Проверить является ли оно палиндромом.
1881 -> true
5081 -> false
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 999 && n < 10000) {

            int end = n % 10;
            int start = n / 1000;

            if (end != start) {
                System.out.println("Не палиндром");
            } else {
                end = (n % 100) / 10;
                start = (n / 100) % 10;

                if (end != start) {
                    System.out.println("Не палиндром");
                } else {
                    System.out.println("Палиндром");
                }
            }
        } else {
            System.out.println("Некорректное число");
        }
    }
}
