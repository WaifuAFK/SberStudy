package Homework;

/*
На вход подается количество секунд, прошедших с начала текущего дня – count.
Выведите в консоль текущее время в формате: часы и минуты.

1. Часы = секунды / 3600

2. Минуты = (секунды / 60) % 60
 */

import java.util.Scanner;

public class Part1Number4 {
    public static void main(String[] args) {

        int count;
        double hours, minutes;

        Scanner input = new Scanner(System.in);
        count = input.nextInt();

        hours = count / 3600;
        minutes = (count / 60) % 60;

        System.out.println((int) hours + " " + (int) minutes);
    }
}
