package Homework.Number2.Part2;

/*
На вход подается число N — количество строк и столбцов матрицы. Затем
передается сама матрица, состоящая из натуральных чисел. После этого
передается натуральное число P.
Необходимо найти элемент P в матрице и удалить столбец и строку его
содержащий (т.е. сохранить и вывести на экран массив меньшей размерности).
Гарантируется, что искомый элемент единственный в массиве.

Пример:

3
1 2 3
1 7 3
1 2 3
7

1 3
1 3

4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 5
5

1 2 3
1 2 3
1 2 3
 */

import java.util.Scanner;

public class N2Part2Number4 {

    public static void main(String[] args) {
        int yPos = 0, xPos = 0;
        String result = "";
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] matrixArray = new int[N][N];

        // Заполнить матрицу
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                matrixArray[i][j] = sc.nextInt();
            }
        }

        int P = sc.nextInt();

        // Найти и запомнить P
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                if (matrixArray[i][j] == P) {
                    yPos = i;
                    xPos = j;
                }
            }
        }

        // Сменить лишние элементы массива matrixArray на 0
        // горизональная колонка
        for (int i = 0; i < N; i++) {
            matrixArray[yPos][i] = 0;
        }
        // вертикальная колонка
        for (int i = 0; i < matrixArray.length; i++) {
            matrixArray[i][xPos] = 0;
        }

        // Вывести result
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                if (matrixArray[i][j] != 0) {
                    result += matrixArray[i][j] + " ";
                }
            }
            if (result == "") {
                continue;
            } else {
                System.out.println(result.substring(0, result.length() - 1));
                result = "";
            }
        }
    }
}
