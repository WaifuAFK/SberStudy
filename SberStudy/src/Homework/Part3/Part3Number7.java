package Homework.Part3;

/*
Дана строка s. Вычислить количество символов в ней, не считая пробелов
(необходимо использовать цикл).
Ограничения:
0 < s.length() < 1000
 */

import java.util.Scanner;

public class Part3Number7 {
    public static void main(String[] args) {
        String n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextLine();

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == ' ')
                sum += 0;
            else
                sum += 1;
        }

        System.out.println(sum);
    }
}
