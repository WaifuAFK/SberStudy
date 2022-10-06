package Praktikum.August24;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // nextLine s считает в себя не следующую строку, а ее перевод, чтобы этого избежать, необходимо дообавить пустой nextLine перед считыванием строки
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println(a);
        System.out.println(s);
    }
}
