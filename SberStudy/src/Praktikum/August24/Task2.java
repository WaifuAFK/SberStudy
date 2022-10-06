package Praktikum.August24;

/*
Дано число n
Если оно четное и больше либо = 0, то вывести "Четное больше либо равно 0"
Если четное и меньше 0, то вывести "Четное меньше 0"
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        if (n % 2 == 0 && n >= 0){
//            System.out.println("Четное больше либо равно 0");
//        }
//        if (n % 2 == 0 && n < 0){
//            System.out.println("Четное меньше 0");
//        }

        // Вложенное условие будет более оптимизированным, тк у компилятора уйдет меньше ресурсов на проверку

        if (n % 2 == 0){
            if (n >= 0){
                System.out.println("Четное больше либо равно 0");
            } else {
                System.out.println("Четное меньше 0");
            }
        }
    }
}
