package Day_3;

/*

Постановка задачи

Индекс массы тела (BMI - Body Mass Index) является показателем здоровья, исходя из роста и веса человека. Его можно вычислить по формуле:

вес
рост

где вес в килограммах, а рост в метрах. Интерпретация индекса массы тела для людей (от 20 лет и старше) следующая:
BMI 	Интерпретация
BMI < 18.5 	Недостаточный вес
18.5 ≤ BMI < 25.0 	Норма
25.0 ≤ BMI < 30.0 	Избыточный вес
30.0 ≤ BMI 	Ожирение



Напишите программу, которая получает от пользователя вес в килограммах и рост в сантиметрах, а отображает и интерпретирует его BMI.
Анализ задачи

Константы:

final int SMS_PER_METER = 100; // 1 метр содержит 100 см

Входные данные:

double weight; // вес в килограммах
double height; // рост в сантиметрах

Выходные данные:

double bmi; // индекс массы тела

Формулы:

bmi = weight / (height / SMS_PER_METER * height / SMS_PER_METER);

Проектирование

Алгоритм с уточнениями:

1. Получить вес в килограммах.

2. Получить рост в сантиметрах.

3. Вычислить BMI.

   3.1. bmi = weight / (height / SMS_PER_METER * height / SMS_PER_METER);

4. Отобразить и интерпретировать BMI.

   4.1. Отобразить BMI.

   4.2. Если BMI < 18.5, то отобразить "Недостаточный вес".

   4.3. Иначе, если BMI < 25, то отобразить "Норма".

   4.4. Иначе, если BMI < 30, то отобразить "Избыточный вес".

   4.5. Иначе отобразить "Ожирение".

Задание:

Перепишите программу ComputeAndInterpretBMI таким образом, чтобы она запрашивала у пользователя рост в метрах и сантиметрах.
Пример запуска для человека ростом 183 сантиметра:

Введите вес в килограммах:  75
Введите рост в метрах:  1
Введите рост в сантиметрах:  83
BMI равно 22.39541341933172
Норма


 */

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        final int SMS_PER_METER = 100; // 1 метр содержит 100 см
        double weight, heightMeters, heightSantimeters, height, bmi;

        Scanner input = new Scanner(System.in);

        // Получить вес в килограммах
        System.out.print("Введите вес в килограммах: ");
        weight = input.nextDouble();

        // Получить рост в метрах
        System.out.print("Введите рост в метрах: ");
        heightMeters = input.nextDouble();

        // Получить рост в сантиметрах
        System.out.print("Введите рост в сантиметрах: ");
        heightSantimeters = input.nextDouble();

        // Перевести рост в Сантиметры
        height = heightSantimeters + (heightMeters * 100);

        // Вычислить BMI
        bmi = weight / (height / SMS_PER_METER * height / SMS_PER_METER);

        // Отобразить и интерпретировать BMI
        System.out.println("BMI равно " + bmi);
        if (bmi < 18.5)
            System.out.println("Недостаточный вес");
        else if (bmi < 25)
            System.out.println("Норма");
        else if (bmi < 30)
            System.out.println("Избыточный вес");
        else
            System.out.println("Ожирение");
    }
}
