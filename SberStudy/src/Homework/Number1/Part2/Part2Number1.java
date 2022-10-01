package Homework.Number1.Part2;

/*
За каждый год работы Петя получает на ревью оценку. На вход
подаются оценки Пети за последние три года (три целых положительных числа).
Если последовательность оценок строго монотонно убывает, то вывести "Петя,
пора трудиться"
В остальных случаях вывести "Петя молодец!"

Ограничения:
0 < a, b, c < 100
 */

import java.util.Scanner;

public class Part2Number1 {
    public static void main(String[] args) {
        int firstValue, secondValue, thirdValue;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 3 оценки через пробел:");

        firstValue = sc.nextInt();
        secondValue = sc.nextInt();
        thirdValue = sc.nextInt();

        if (thirdValue < secondValue && secondValue < firstValue) {
            System.out.println("Петя, пора трудиться");
        } else {
            System.out.println("Петя молодец!");
        }
    }
}
