package Homework.Part3;

/*
Дано натуральное число n. Вывести его цифры в “столбик"
 */

import java.util.Scanner;

public class Part3Number4 {
    public static void main(String[] args) {
        String n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextLine();

        for (int i = 0; i < n.length(); i++) {
            System.out.println(n.charAt(i));
        }
    }
}
