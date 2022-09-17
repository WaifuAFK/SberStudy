package Homework.Part2;

/*
Раз так легко получается разделять по первому пробелу, Петя решил
немного изменить предыдущую программу и теперь разделять строку по
последнему пробелу.
Ограничения:
В строке гарантированно есть хотя бы один пробел

 */

import java.util.Scanner;

public class Part2Number8 {
    public static void main(String[] args) {
        String s;
        int space;

        Scanner sc = new Scanner(System.in);

        s = sc.nextLine();

        space = s.lastIndexOf(' ');

        System.out.println(s.substring(0,space));
        System.out.println(s.substring(space + 1, s.length()));
    }
}
