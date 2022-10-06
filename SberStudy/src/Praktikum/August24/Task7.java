package Praktikum.August24;

/*
Даны три целых числа a b c. Проверить есть ли среди них противоположные. Результат вывести в true / false. 0 и 0 не считать прямопротивоположными
 */

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a == -b && a != 0) || (a == -c && a != 0) || (b == -c && b != 0));
    }
}