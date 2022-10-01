package Homework.Number1.Part2;
/*
Петя недавно изучил строки в джаве и решил попрактиковаться с ними.
Ему хочется уметь разделять строку по первому пробелу. Для этого он может
воспользоваться методами indexOf() и substring().
На вход подается строка. Нужно вывести две строки, полученные из входной
разделением по первому пробелу.

Ограничения:
В строке гарантированно есть хотя бы один пробел
Первый и последний символ строки гарантированно не пробел
2 < s.length() < 100
 */

import java.util.Scanner;

public class Part2Number7 {
    public static void main(String[] args) {
        String s;
        int space;

        Scanner sc = new Scanner(System.in);

        s = sc.nextLine();

        space = s.indexOf(' ');
        System.out.println(s.substring(0,space));
        System.out.println(s.substring(space + 1, s.length()));
    }
}
