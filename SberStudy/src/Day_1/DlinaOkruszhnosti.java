package Day_1;

/*
Напишите программу, которая получает от пользователя радиус окружности, а вычисляет и отображает длину окружности.
Используйте при написании программы соглашение по именованию, а также рекомендованный стиль программирования и документирования.

 C = 2πr, где C – длина окружности, r – радиус окружности

Методика решения:

1. Получить радиус окружности

2. Вычислить длину окружности
2.1 длина окружности = 2 * пи * радиус

3. Отобразить полученный результат

 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class DlinaOkruszhnosti {
    public static void main(String[] args) {

        final double PI = 3.14;
        double length, radius;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите радиус окружности: ");
        radius = input.nextDouble();
        length = 2 * PI * radius;

        System.out.println("Длина окружности с радиусом " + radius + " равна " + length);

    }
}
