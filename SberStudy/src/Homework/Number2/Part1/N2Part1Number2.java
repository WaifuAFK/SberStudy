package Homework.Number2.Part1;

/*
На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов. После этого аналогично передается второй
массив (aj) длины M.

Необходимо вывести на экран true, если два массива одинаковы (то есть
содержат одинаковое количество элементов и для каждого i == j элемент ai ==
aj). Иначе вывести false

1. Сканер N
2. Через цикл сканер массива [N]
3. Сканер M
4. Через цикл сканер массива [M]
5. Цикл для сравнения значений двух массивов
 */

import java.util.Scanner;

public class N2Part1Number2 {
    public static void main(String[] args) {
        int N, M;
        int[] myArrayN;
        int[] myArrayM;
        boolean isEqual = true;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        myArrayN = new int[N];

        // Заполнить массив N входными данными
        for (int i = 0; i <= N - 1; i++) {
            myArrayN[i] = sc.nextInt();
        }

        M = sc.nextInt();
        myArrayM = new int[M];

        // Заполнить массив M входными данными
        for (int i = 0; i <= M - 1; i++) {
            myArrayM[i] = sc.nextInt();
        }

        if (myArrayN.length != myArrayM.length) {
            isEqual = false;
        } else
            for (int i = 0; i < myArrayN.length - 1; i++) {
                if (myArrayN[i] != myArrayM[i])
                    isEqual = false;
            }
        System.out.println(isEqual);
    }
}
