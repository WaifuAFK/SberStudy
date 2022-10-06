package Praktikum.August24;

/*
Дана последовательность символов английского алфавита или цифр, конкатенировать их в одну строку и вывести эту строку, исключая цифры
 */

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        String a2 = sc.next();
        String a3 = sc.next();
        String a4 = sc.next();
        String a5 = sc.next();
        String result = "";

        if (a1.charAt(0) < '0' || a1.charAt(0) > '9') {
            result += a1;
        }
        if (a2.charAt(0) < '0' || a2.charAt(0) > '9') {
            result += a2;
        }
        if (a3.charAt(0) < '0' || a3.charAt(0) > '9') {
            result += a3;
        }
        if (a4.charAt(0) < '0' || a4.charAt(0) > '9') {
            result += a4;
        }
        if (a5.charAt(0) < '0' || a5.charAt(0) > '9') {
            result += a5;
        }

        System.out.println(result);
    }
}
