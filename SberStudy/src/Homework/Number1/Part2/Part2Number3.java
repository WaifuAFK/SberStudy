package Homework.Number1.Part2;
/*
Петя снова пошел на работу. С сегодняшнего дня он решил ходить на
обед строго после полудня. Периодически он посматривает на часы (x - час,
который он увидел). Помогите Пете решить, пора ли ему на обед или нет. Если
время больше полудня, то вывести "Пора". Иначе - “Рано”.

Ограничения:
0 <= n <= 23
 */

import java.util.Scanner;

public class Part2Number3 {
    public static void main(String[] args) {
        int x;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        if (x > 12)
            System.out.println("Пора");
        else
            System.out.println("Рано");
    }
}
