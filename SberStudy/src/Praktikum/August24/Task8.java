package Praktikum.August24;

/*
Даны три числа a b c. Найти сумму двух чисел больших из них
 */

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.println(b + c);
        } else if (b <= a && b <= c) {
            System.out.println(a + c);
        } else {
            System.out.println(a + b);
        }

        // второй вариант очень компактный вариант
        System.out.println(Math.max(Math.max(a + b, b + c), a + c));
    }
}
