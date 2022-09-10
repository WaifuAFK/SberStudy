package Project;
/*
Валюта - Японская Йена

Напишите программу, которая конвертирует сумму денег из японских йен в российские рубли по курсу покупки 55,92

Константы задачи:

final double ROUBLES_PER_YEN = 55,92; // курс покупки

Входные данные задачи:

int yens; // сумма денег в японских йенах

Выходные данные задачи:

double roubles; // сумма денег в российских рублях

Соответствующие формулы:

roubles = ROUBLES_PER_YEN * yens;



Алгоритм решения задачи с уточнениями:

1. Получить сумму денег в японских йенах

2. Конвертировать сумму денег в российские рубли.

   2.1. roubles = ROUBLES_PER_YEN * yens;

3. Отобразить сумму денег в российских рублях в пользу покупателя.
 */

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {

        final double ROUBLES_PER_YEN = 55.92;
        int yens;
        double roubles;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму японских йен: ");
        yens = input.nextInt();

        roubles = ROUBLES_PER_YEN * yens;

        System.out.println(yens + " йен в российских рублях будет: " + roubles + "  рублей");
    }
}
