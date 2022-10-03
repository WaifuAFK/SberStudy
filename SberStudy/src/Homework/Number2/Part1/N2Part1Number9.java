package Homework.Number2.Part1;

/*
На вход подается число N — длина массива. Затем передается массив
строк из N элементов (разделение через перевод строки). Каждая строка
содержит только строчные символы латинского алфавита.

Необходимо найти и вывести дубликат на экран. Гарантируется что он есть и
только один.
 */

import java.util.Arrays;
import java.util.Scanner;

public class N2Part1Number9 {
    public static void main(String[] args) {
        int N;
        String[] myArray;
        String RESULT = "";

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        myArray = new String[N];

        // Заполнить массив входными данными
        for (int i = 0; i <= myArray.length - 1; i++) {
            myArray[i] = sc.next();
        }

        // Вложенный цикл для провереки равенства элементов массива
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (myArray[i].equals(myArray[j]))
                    RESULT = myArray[i];
            }
        }

        System.out.println(RESULT);
    }
}
