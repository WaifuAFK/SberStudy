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

        for (int i = Y1; i <= Y2; i++) {
            for (int j = X1; j <= X2; j++) {
                matrixArray[i][j] = 1;
            }
        }


        for (int[] ints : matrixArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        
    }
}
