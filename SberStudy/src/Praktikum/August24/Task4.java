package Praktikum.August24;

/*
Считать данные из консоли о типе номера отеля. 1 VIP 2 Premium 3 Comfort
Вывести цену номера VIP 125 Premium 110 Comfort 100
 */

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roomType =  sc.nextInt();

        switch (roomType) {
            case 1 -> System.out.println(125);
            case 2 -> System.out.println(110);
            case 3 -> System.out.println(100);
            default -> System.out.println("Неизвестный тип номера");
        }
    }
}
