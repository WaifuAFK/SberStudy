package Homework;

/*
На вход подается двузначное число n. Выведите число, полученное
перестановкой цифр в исходном числе n. Если после перестановки получается
ведущий 0, его также надо вывести.
 */

import java.util.Scanner;

public class Part1Number7 {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        System.out.print(n % 10);
        System.out.println(n / 10);
    }
}
