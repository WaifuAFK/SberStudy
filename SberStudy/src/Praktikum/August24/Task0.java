package Praktikum.August24;

/*
Дано целое число n
Вывести следующее за ним четное число
Нельзя использовать условную конструкцию if и циклы
 */

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n + 2 - Math.abs(n) % 2);
    }
}
