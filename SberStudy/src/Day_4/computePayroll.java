package Day_4;

/*

Постановка задачи

Напишите программу, которая вычисляет и отображает зарплату каждого сотрудника, а также
общую зарплату компании, исходя из отработанного каждым сотрудником времени в часах и часовой ставки в рублях.
Анализ задачи

Входные данные:

int number_emp; // количество сотрудников
double hours; // отработанные часы
double rate; // часовая ставка в руб.

Переменные программы:

int count_emp; // текущий сотрудник

Выходные данные:

double pay; // зарплата текущего сотрудника в руб.
double total_pay; // общая зарплата компании

Формулы:

pay = hours * rate;

total_pay = total_pay + pay;

count_emp = count_emp + 1;

Проектирование

Алгоритм с уточнениями:

1. Получить количество сотрудников в компании.

2. До тех пор, пока не обработаны все сотрудники, вычислять и отображать зарплату каждого сотрудника и прибавлять ее к общей зарплате компании.

   2.1. Получить отработанные часы для текущего сотрудника.

   2.2. Получить часовую ставку для текущего сотрудника.

   2.3. Вычислить и отобразить зарплату текущего сотрудника в рублях.

      2.3.1. pay = hours * rate;

   2.4. Прибавить зарплату текущего сотрудника к общей зарплате компании.

      2.4.1. total_pay = total_pay + pay;

   2.5. Перейти к следующему сотруднику.

      2.5.1. count_emp = count_emp + 1;

3. Отобразить общую зарплату компании в рублях.
 */

import java.util.Scanner;

public class computePayroll {
    public static void main(String[] args) {
        int number_emp; // количество сотрудников
        double hours; // отработанные часы
        double rate; // часовая ставка в руб.
        int count_emp = 1; // текущий сотрудник
        double pay; // зарплата текущего сотрудника в руб.
        double total_pay = 0; // общая зарплата компании

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество сотрудников в компании: ");
        number_emp = scanner.nextInt();

        while (count_emp < number_emp + 1) {
            System.out.print("Введите количество отработанных часов " + count_emp + " сотрудником: ");
            hours = scanner.nextDouble();

            System.out.print("Введите почасовую ставку для " + count_emp + " сотрудника: ");
            rate = scanner.nextDouble();

            pay = hours * rate;

            System.out.println("Зарплата " + count_emp + " сотрудника - " + pay);

            total_pay += pay;
            count_emp++;
        }
        System.out.println("\nВсе сотрудники обработаны.\n");

        System.out.println("Общая зарплата компании - " + total_pay);
    }
}
