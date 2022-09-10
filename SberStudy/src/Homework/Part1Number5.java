package Homework;

/*
Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров). На вход
подается количество дюймов, выведите количество сантиметров.

 */

import java.util.Scanner;

public class Part1Number5 {
    public static void main(String[] args) {

        final double DIUMINSANTIMETER = 2.54;
        double santimetres;

        Scanner input = new Scanner(System.in);

        santimetres = input.nextDouble();

        System.out.println(santimetres * DIUMINSANTIMETER);
    }
}
