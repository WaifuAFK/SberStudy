package Praktikum.August31;

/*
Проверить, является ли введенная строка корректным hex номером цвета.
Корректная строка состоит из 7 символов, первый символ “#”, далее цифры или буквы от A до F (заглавные или прописные)

Если строка является корректным hex номером цвета, то вывести true, иначе false.

Пример:
#00AA12 --> true
00FFFF --> false
#00FA --> false
#00AЯ.2 --> false
*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();

        System.out.println(color.matches("#[0-9A-Fa-f]{6}"));
    }
}
