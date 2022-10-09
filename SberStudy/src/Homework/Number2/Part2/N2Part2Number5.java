package Homework.Number2.Part2;

/*
На вход подается число N — количество строк и столбцов матрицы.
Затем передается сама матрица, состоящая из натуральных чисел.
Необходимо вывести true, если она является симметричной относительно
побочной диагонали, false иначе.

Побочной диагональю называется диагональ, проходящая из верхнего правого
угла в левый нижний
 */

import java.util.Scanner;

public class N2Part2Number5 {

    public static void main(String[] args) {
        boolean isEqual = true;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int min = 0;
        int max = N - 1;

        int[][] matrixArray = new int[N][N];

        // Заполнить матрицу
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                matrixArray[i][j] = sc.nextInt();
            }
        }

        // Цикл для сравнения двух половин символов между диагональю
        for (int i = 0, k = N - 1; i < N; i++, k--) {
            for (int j = N - 1; j > 0; j--) {
                if (matrixArray[i][min] != matrixArray[max][k]) {
                    isEqual = false;
                }
                min++;
                max--;
            }
            min = 0;
            max = N - 1;
        }

        System.out.println(isEqual);
    }
}
