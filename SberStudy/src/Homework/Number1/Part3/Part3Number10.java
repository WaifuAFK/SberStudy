package Homework.Number1.Part3;

import java.util.Scanner;

/*
Вывести на экран “ёлочку” из символа звездочки (*) заданной высоты N. На N +
1 строке у “ёлочки” должен быть отображен ствол из символа |


 */
public class Part3Number10 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int x = 0; x < n - i; x++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int j = 0; j < n ; j++) {
            System.out.print(" ");
        }
        System.out.print("|");
    }
}
