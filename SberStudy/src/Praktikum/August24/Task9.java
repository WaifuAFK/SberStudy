package Praktikum.August24;

/*
Реализовать System.out.println(), используя System.out.print() и табуляцию \n
Входные данные: два слова, считываемые из консоли
 */

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        System.out.print(word.substring(0, word.indexOf(' ')) + '\n' + word.substring(word.indexOf(' ') + 1, word.length()));
    }
}
