package Praktikum.August24;

/*
Дано число n. Нужно проверить четное ли оно
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 ==  0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

//        System.out.println(n % 2 == 0);
    }
}
