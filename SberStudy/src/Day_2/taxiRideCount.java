package Day_2;

/*
Напишите программу, которая вычисляет стоимость проезда в такси в зависимости от расстояния из расчета 8 руб. 50 коп. за километр. Ваша программа должна взаимодействовать с пользователем следующим образом:

СЧЕТЧИК СТОИМОСТИ ПРОЕЗДА
Введите начальные показания одометра: 13505
Введите конечные показания одометра: 13810
Вы проехали 305 км. Из расчета 8 руб. 50 коп. за км,
стоимость проезда равна 2592 руб. 50 коп.

Константы:

final double KILOMETER_PRICE = 8.5; // стоимость одного километра

Входные данные:

int beforeOdometer, afterOdometer; // переменные одометра начальные и конечные

Переменные программы:

double sumCommon // стоимость поездки до разделения на рубли и копейки

Выходные данные:

int kilometerDifference - пройденное расстоние.
int sumRubles - стоимость поездки в рублях
int sumKopeeks - стоимость поездки  в копейках

Формулы:

kilometerDifference = afterOdometer - beforeOdometer // пройденное расстояние


Алгоритм с уточнениями:

1. Получить начальные показания одометра.

2. Получить конечные показания одометра.

3. Вычислить пройденное расстояние:
3.1 kilometerDifference = afterOdometer - beforeOdometer

4. Вычислить сумму поездки:
4.1. sumCommon = kilometerDifference * KILOMETER_PRICE

5. Вычислить стоимость поездки в рублях
5.1. sumRubles = sumCommon / KILOMETER_PRICE

6. Вычислить стоимость поездки в копейках
6.1. sumKopeeks = sumCommon % KILOMETER_PRICE

7. Вывести данные по пройденному расстоянию, сумме поездки в рублях и сумме поездки в копейках



 */

import java.util.Scanner;

public class taxiRideCount {

    public static void main(String[] args) {

        final double KILOMETER_PRICE = 8.5;
        int beforeOdometer, afterOdometer;
        double sumCommon, sumKopeeks;

        int kilometerDifference;
        int sumRubles;


        Scanner input = new Scanner(System.in);

        System.out.print("Введите начальные показания одометра: ");
        beforeOdometer = input.nextInt();

        System.out.print("Введите конечные показания одометра: ");
        afterOdometer = input.nextInt();

        // вычисляем пройденное расстояние
        kilometerDifference = afterOdometer -  beforeOdometer;

        // вычисляем сумму поездки до пребразования
        sumCommon = kilometerDifference * KILOMETER_PRICE;

        // вычисляем сумму поездки в рублях
        sumRubles = (int) (sumCommon);

        // вычисляем сумму поездки в копейках
        sumKopeeks = (sumCommon % 1 * 100);

        System.out.println("Вы проехали " + kilometerDifference +  " км. Из расчёта 8 руб. 50 коп. за км, стоимость проезда равна " + sumRubles + " руб. " + (int) sumKopeeks + " коп.");
    }
}
