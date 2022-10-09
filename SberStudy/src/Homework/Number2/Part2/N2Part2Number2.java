package Homework.Number2.Part2;

/*
На вход подается число N — количество строк и столбцов матрицы. Затем в
последующих двух строках подаются координаты X (номер столбца) и Y (номер
строки) точек, которые задают прямоугольник.

Необходимо отобразить прямоугольник с помощью символа 1 в матрице,
заполненной нулями (см. пример) и вывести всю матрицу на экран

5
1 0
4 1

0 1 1 1 1
0 1 1 1 1
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0

7
1 2
3 4

0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 1 1 1 0 0 0
0 1 0 1 0 0 0
0 1 1 1 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0

1. Создать сканер
2. Принять N матрицы
3. Получить X и Y
4. Создать матрицу
 */


import java.util.Scanner;

public class N2Part2Number2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();

        int[][] matrixArray = new int[N][N];

        //1 цикл для верхней грани
        for (int i = X1; i <= X2; i++) {
            matrixArray[Y1][i] = 1;
        }

        // 2 цикл для боковых граней (середина должна быть пустой)
        for (int i = Y1 + 1; i < Y2; i++) {
            matrixArray[i][X1] = 1;
            matrixArray[i][X2] = 1;
        }

        //3 цикл для нижней грани грани
        for (int i = X1; i <= X2; i++) {
            matrixArray[Y2][i] = 1;
        }

        for (int i = 0; i < matrixArray.length; i++) {
            System.out.print(matrixArray[i][0]);
            for (int j = 1; j < matrixArray[i].length; j++) {
                System.out.print(" " + matrixArray[i][j]);
            }
            System.out.println();
        }
    }
}
