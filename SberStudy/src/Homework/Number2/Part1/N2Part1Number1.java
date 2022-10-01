package Homework.Number2.Part1;

/*
На вход подается число N — длина массива. Затем передается массив
вещественных чисел (ai) из N элементов.

Необходимо реализовать метод, который принимает на вход полученный
массив и возвращает среднее арифметическое всех чисел массива.
Вывести среднее арифметическое на экран.

1. Сканер N
2. Сканер массива через цикл
3. Метод со средним арифметическим:
Завести перменную sum = 0.
sum += array[i]
4. Вывод
 */

import java.util.Scanner;

public class N2Part1Number1 {
    public static void main(String[] args) {
        int N;
        double[] myArray;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        myArray = new double[N];

        // Заполнить массив входными данными
        for (int i = 0; i <= N - 1; i++) {
            myArray[i] = sc.nextDouble();
        }

        // Вывести результат
        averageArifmetic(myArray);
    }

    /**
     * Метод, вычисляющий среднее арифметическое элементов массива
     */
    public static void averageArifmetic (double[] methodArray) {
        double sum = 0;

        for (double v : methodArray) {
            sum += v;
        }
        System.out.println(sum / methodArray.length);
    }
}
