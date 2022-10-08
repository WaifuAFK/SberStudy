package Homework.Number2.Part2;

/*
На вход передается N — количество столбцов в двумерном массиве и M —
количество строк. Затем сам передается двумерный массив, состоящий из
натуральных чисел.

Необходимо сохранить в одномерном массиве и вывести на экран
минимальный элемент каждой строки.

1. Объявить сканер
2. Получить N и M
3. Создать двумерный массив [M][N] и заполнить его значениями
4. Создать одномерный массив [N]
5. Пройти циклом по каждой строке массива [M][N] и присвоить N[i] минимальное значение из каждой строки
6. Вывести результат
 */

import java.util.Scanner;

public class N2Part2Number1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int minValor = 0;

        int[][] inputArray = new int[M][N];
        int[] resultArray = new int[M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                inputArray[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= M - 1; i++) {
            minValor = inputArray[i][0];
            for (int j = 1; j < N; j++) {
                if (inputArray[i][j] < minValor)
                    minValor = inputArray[i][j];
            }
            resultArray[i] = minValor;
        }

        for (int i = 0; i < resultArray.length - 1; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println(resultArray[resultArray.length - 1]);
    }
}
