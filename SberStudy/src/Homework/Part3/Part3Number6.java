package Homework.Part3;

/*
В банкомате остались только купюры номиналом 8 4 2 1. Дано положительное
число n - количество денег для размена. Необходимо найти минимальное
количество купюр с помощью которых можно разменять это количество денег
(соблюсти порядок: первым числом вывести количество купюр номиналом 8,
вторым - 4 и т д)
 */

import java.util.Scanner;

public class Part3Number6 {
    public static void main(String[] args) {
        int n;
        int ost = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int eights = n / 8;
        ost = n % 8;
        int foutrh = ost / 4;
        ost = ost % 4;
        int two = ost / 2;
        ost = ost % 2;
        int odn = ost / 1;
        System.out.println(eights + " " + foutrh + " " + two + " " + odn);

    }
}
