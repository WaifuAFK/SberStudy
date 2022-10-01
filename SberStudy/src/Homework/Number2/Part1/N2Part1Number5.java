package Homework.Number2.Part1;

/*
На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов. После этого передается число M — величина
сдвига.

Необходимо циклически сдвинуть элементы массива на M элементов вправо
 */

import java.util.Scanner;

public class N2Part1Number5 {
    public static void main(String[] args) {
        int N, M;
        int[] myArray;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        myArray = new int[N];

        // Заполнить массив входными данными
        for (int i = 0; i <= N - 1; i++) {
            myArray[i] = sc.nextInt();
        }

        // Получить M
        M = sc.nextInt();

        // Выполнить сдвиг массива на M
        myArray = shiftArr(myArray, M);

        // Вывести результат
        for(int i=0; i< myArray.length; i++ )
        {
            System.out.print(myArray[i]+" ");
        }
    }

    /**
     * Метод, который сдвигает значения в массиве на M
     */
    public static int[] shiftArr(int[] inArr, int M) {
        while(M > 0)
        {
            int lastVar = inArr[inArr.length-1];
            for(int counter = 0; counter<inArr.length; counter++)
            {
                int curVal = inArr[counter];
                inArr[counter] = lastVar;
                lastVar = curVal;
            }
            M--;
        }
        return inArr;
    }
}
