package Homework.Number1.Part1;

/*
На вход подается бюджет мероприятия – n тугриков. Бюджет на одного гостя – k
тугриков. Вычислите и выведите, сколько гостей можно пригласить на
мероприятие.
 */

import java.util.Scanner;

public class Part1Number9 {
    public static void main(String[] args) {
        int k, n;

        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        k = input.nextInt();

        System.out.println(n / k);
    }
}
