package Homework.Number2.Part1;

/*
На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов, отсортированный по возрастанию. После этого
вводится число X — элемент, который нужно добавить в массив, чтобы
сортировка в массиве сохранилась.

Необходимо вывести на экран индекс элемента массива, куда нужно добавить
X. Если в массиве уже есть число равное X, то X нужно поставить после уже
существующего.

1. Сканер N
2. Cканер массива[N}
3. Сканер X
4. Цикл for для обхода массива, в котором будет сравниваться X и элемент массива
 */

import java.util.Scanner;

public class N2Part1Number3 {
    public static void main(String[] args) {
        int N, X;
        int answer = 0;
        int [] myArray;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        myArray = new int [N];

        // Заполнить массив входными данными
        for (int i = 0; i <= N - 1; i++) {
            myArray[i] = sc.nextInt();
        }

        // Получить X
        X = sc.nextInt();

        //Вывести индекс в массиве для X
        int i = 0;
        while (i < myArray.length - 1) {
            if (X < myArray[i]) {
                answer = i;
                break;
            }
            if (X == myArray[i]) {
                answer = i + 1;
            }
            if (X > myArray[i] && X < myArray[i + 1]) {
                answer = i + 1;
                break;
            }
            i++;
        }
        System.out.println(answer);
    }
}