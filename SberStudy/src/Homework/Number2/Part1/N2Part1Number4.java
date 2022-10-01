package Homework.Number2.Part1;

/*
На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов, отсортированный по возрастанию.

Необходимо вывести на экран построчно сколько встретилось различных
элементов. Каждая строка должна содержать количество элементов и сам
элемент через пробел.

1. Сканер N
2. Cканер массива[N}
3. Инициализировать переменную подсчета внутри цикла по обходу массива
4. Выводить значения уже в процессе обхода
 */

import java.util.Scanner;

public class N2Part1Number4 {
    public static void main(String[] args) {
        int[] myArray;
        int counter = 0, count = 0;

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        myArray = new int[N];
        int[] result = new int[N];

        // Заполнить массив входными данными
        for (int i = 0; i <= N - 1; i++) {
            myArray[i] = sc.nextInt();
        }

        for (int i = 0; i < myArray.length; i++) {
            boolean isDistinct = false;
            for (int j = 0; j < i; j++) {
                if (myArray[i] == myArray[j]) {
                    isDistinct = true;
                    break;
                }
            }
            if (!isDistinct)
                result[counter++] = myArray[i];
        }

        for (int i = 0; i < counter; i++) {
            count = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (result[i] == myArray[j])
                    count++;
            }
            System.out.println(count + " " + result[i]);
        }
    }
}
