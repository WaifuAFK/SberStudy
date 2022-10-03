package Homework.Number2.Part1;

/*
На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов. После этого передается число M.


Необходимо найти в массиве число, максимально близкое к M (т.е. такое число,
для которого |ai - M| минимальное). Если их несколько, то вывести
максимальное число.
 */

import java.util.Scanner;

public class N2Part1Number8 {
    public static void main(String[] args) {
        int N, M;
        int[] myArray;
        int min = 1000;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        myArray = new int[N];

        // Заполнить массив входными данными
        for (int i = 0; i <= N - 1; i++) {
            myArray[i] = sc.nextInt();
        }

        // Получить число М
        M = sc.nextInt();

        // Начальное значение, с которым будет сравниваться весь цикл
        int differenceFirst = Math.abs(myArray[0] - M);

        // Цикл, в котором ai - m проверяется с минимальным значением
        for (int i = 0; i < myArray.length; i++) {
            int difference = Math.abs(myArray[i] - M);
            if (difference < differenceFirst)
                min = myArray[i];
        }

        System.out.println(min);
    }
}
