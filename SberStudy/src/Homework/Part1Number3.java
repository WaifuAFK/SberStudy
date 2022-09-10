package Homework;

import java.util.Scanner;

/*
Прочитайте из консоли имя пользователя и выведите в консоль строку:
Привет, <имя пользователя>!
Подсказка:
Получите данные из консоли c помощью объекта Scanner, сохраните в
переменную userName и выведите в консоль с помощью System.out.println()
 */
public class Part1Number3 {
    public static void main(String[] args) {
        String userName;

        Scanner input = new Scanner(System.in);
        userName = input.nextLine();

        System.out.println("Привет, " + userName + "!");
    }
}
