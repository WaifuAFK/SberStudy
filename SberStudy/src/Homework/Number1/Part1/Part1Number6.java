package Homework.Number1.Part1;

import java.util.Scanner;

/*
На вход подается количество километров count. Переведите километры в мили
(1 миля = 1,60934 км) и выведите количество миль.
 */
public class Part1Number6 {
    public static void main(String[] args) {
        final double MILEPERKILOMETER = 1.60934;
        double count;

        Scanner input = new Scanner(System.in);

        count = input.nextDouble();

        System.out.println(count / MILEPERKILOMETER);
    }
}
