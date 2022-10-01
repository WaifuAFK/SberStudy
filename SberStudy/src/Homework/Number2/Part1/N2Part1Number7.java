package Homework.Number2.Part1;

/*
На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов, отсортированный по возрастанию.

Необходимо создать массив, полученный из исходного возведением в квадрат
каждого элемента, упорядочить элементы по возрастанию и вывести их на
экран.

Алгоритм решения
1. Сканер N
2. Сканер массива
3. Создать зеркальный массив, элементы которого будет возвездены в квадрат
4. Упорядочить массив по возрастанию
5. Вывести массив
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class N2Part1Number7 {
    public static void main(String[] args) {
        int N;
        int[] myArray;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        myArray = new int[N];

        int[] resultArray = new int[N];

        // Заполнить массив входными данными
        for (int i = 0; i <= N - 1; i++) {
            myArray[i] = sc.nextInt();
        }

        // Перенсти возвденные в квадрат значения в resultArray
        for (int i = 0; i < myArray.length; i++) {
            resultArray[i] = (int) Math.pow(myArray[i], 2 );
        }

        //Отсортировать и вывести результирующий массив
        Arrays.sort(resultArray);

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            System.out.print(" ");
        }
    }
}
