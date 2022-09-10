package Day_2;

/*
Напишите программу, которая переводит температуру из градусов по шкале Цельсия в градусы по шкале Фаренгейта (т. е. наоборот, чем решено выше), используя арифметическое выражение:
fahrenheit = 9 / 5 * celsius + 32

Методика решения:

1. Получить температуру по Цельсию

2. Вычислить температуру по Фаренгейту
2.1 fahrenheit = 9 / 5 * celsius + 32

3. Отобразить полученный результат

 */

import java.util.Scanner;

public class celsiusToFahrenheit {

    public static void main(String[] args) {
        double fahrenheit, celsius;

        Scanner input = new Scanner(System.in);

        // Получить температуру в градусах по шкале Цельсия
        System.out.print("Введите температуру в градусах по шкале Фаренгейта: ");
        celsius = input.nextDouble();

        // Преобразовать температуру в градусы по шкале Фаренгейта
        fahrenheit = (9.0 / 5) * celsius + 32;

        // Отобразить температуру в градусах по шкале Фаренгейта
        System.out.println(celsius + " градуса по шкале Фаренгейта равно " +
                fahrenheit + " градуса по шкале Цельсия.");
    }
}
