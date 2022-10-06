package Praktikum.August24;

/*
Дана строка и паттерн, заменить паттерн на паттерн состоящий из заглавных символов.
Входные данные
Hello world
ld
Выходные данные
Hello WorLD
 */

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String pattern = sc.nextLine();

        System.out.println(sentence.replace(pattern, pattern.toUpperCase()));
    }
}
