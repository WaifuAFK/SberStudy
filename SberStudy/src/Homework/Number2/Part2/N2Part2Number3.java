package Homework.Number2.Part2;

/*
На вход подается число N — количество строк и столбцов матрицы. Затем
передаются координаты X и Y расположения коня на шахматной доске.
Необходимо заполнить матрицу размера NxN нулями, местоположение коня
отметить символом K, а позиции, которые он может бить, символом X.

Пример:

5
0 4
0 0 0 0 0
0 0 0 0 0
0 X 0 0 0
0 0 X 0 0
K 0 0 0 0

7
3 3
0 0 0 0 0 0 0
0 0 X 0 X 0 0
0 X 0 0 0 X 0
0 0 0 K 0 0 0
0 X 0 0 0 X 0
0 0 X 0 X 0 0
0 0 0 0 0 0 0

Независимо от своей постановки X может быть только в 8 определенных позициях:
1. [x -1][y-2] [x+1][y-2]
2. [x-2][y-1] [x+2][y-1]
3. [x-2][y+1] [x+2][y+1]
4. [x -1][y+2] [x+1][y+2]
 */

import java.util.Scanner;

public class N2Part2Number3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        char[][] matrixArray = new char[N][N];

        // заполнить матрицу нулями
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                matrixArray[i][j] = '0';
            }
        }

        // Поставить коня
        matrixArray[Y][X] = 'K';

        // Проставить возможные для коня ходы
        if (X - 1 >= 0 && Y - 2 < matrixArray.length) {
            matrixArray[Y - 2][X - 1] = 'X';
        }
        if (X + 1 >= 0 && Y - 2 < matrixArray.length) {
            matrixArray[Y - 2][X + 1] = 'X';
        }
        if (X - 2 >= 0 && Y - 1 < matrixArray.length) {
            matrixArray[Y - 1][X - 2] = 'X';
        }
        if (X + 2 >= 0 && Y - 1 < matrixArray.length) {
            matrixArray[Y - 1][X + 2] = 'X';
        }
        if (X - 2 >= 0 && Y + 1 < matrixArray.length) {
            matrixArray[Y + 1][X - 2] = 'X';
        }
        if (X + 2 >= 0 && Y + 1 < matrixArray.length) {
            matrixArray[Y + 1][X + 2] = 'X';
        }
        if (X - 1 >= 0 && Y + 2 < matrixArray.length) {
            matrixArray[Y + 2][X - 1] = 'X';
        }
        if (X + 1 >= 0 && Y + 2 < matrixArray.length) {
            matrixArray[Y + 2][X + 1] = 'X';
        }

        // Вывести результат
        for (int i = 0; i < matrixArray.length; i++) {
            System.out.print(matrixArray[i][0]);
            for (int j = 1; j < matrixArray[i].length; j++) {
                System.out.print(" " + matrixArray[i][j]);
            }
            System.out.println();
        }
    }
}
