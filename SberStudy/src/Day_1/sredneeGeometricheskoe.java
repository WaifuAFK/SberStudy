package Day_1;

/*
Напишите программу, которая вычисляет среднее геометрическое трех вещественных чисел по формуле 3*корень(x1*x2*x3).

Методика решения:

1. Получить 3 вещественных числа

2. Вычислить среднее геометрическое
2.1 3*корень(х1*х2*х3)

3. Отобразить полученный результат

 */

import java.util.Scanner;

public class sredneeGeometricheskoe {
    public static void main(String[] args) {
        double number1, number2, number3, average;
        double n = 1/3;// объявление переменных

        Scanner input = new Scanner(System.in); // создание объекта типа Scanner

        // Получить три числа
        System.out.print("Введите три числа, разделенные пробелами: ");
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        number3 = input.nextDouble();

        // Вычислить среднее геометрическое трех чисел
        average = Math.cbrt((number1 * number2 * number3));

        // Отобразить среднее геометрическое трех чисел
        System.out.println("Среднее геометрическое " + number1 + " " + number2
                + " " + number3 + " равно " + average + ".");
    }
}
