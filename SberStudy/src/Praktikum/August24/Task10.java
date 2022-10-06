package Praktikum.August24;

/*
На вход подается символ, необходимо поменять его со строчного на заглавный или с загавного на строчный

97-122 строчные латинские, 65-90 заглавные
 */

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char symbol = sc.next().charAt(0);

        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println((char) (symbol + ('A' - 'a')));
        } else {
            System.out.println((char) (symbol - ('A' - 'a')));
        }
    }
}
