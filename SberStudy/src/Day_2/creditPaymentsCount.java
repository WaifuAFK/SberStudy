package Day_2;

/*

Константы:

final int MONTHS_PER_YEAR = 12; // 1 год содержит 12 месяцев



Входные данные:

double annualInterestRate; // ежегодная ставка в %
int numberOfYears; // срок кредита в годах
double loanAmount; // сумма кредита в рублях



Переменные программы:

double monthlyInterestRate; // ежемесячная ставка в %



Выходные данные:

double monthlyPayment; // ежемесячный платеж в рублях
double totalPayment; // стоимость кредита в рублях



Формулы:

monthlyInterestRate = annualInterestRate / 12 / 100;

monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * MONTHS_PER_YEAR));

totalPayment = monthlyPayment * numberOfYears * MONTHS_PER_YEAR;



Алгоритм с уточнениями:

1. Получить ежегодную ставку по кредиту в процентах.

2. Получить срок кредита в годах.

3. Получить сумму кредита в рублях.

4. Вычислить ежемесячную ставку по кредиту в долях единицы.

   4.1. monthlyInterestRate = annualInterestRate / 12 / 100.

5. Вычислить ежемесячный платеж и стоимость кредита в рублях.

   5.1. monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * MONTHS_PER_YEAR)).

   5.2. totalPayment = monthlyPayment * numberOfYears * MONTHS_PER_YEAR.

6. Отобразить ежемесячный платеж и стоимость кредита в рублях, округлив в пользу заемщика.
 */

import java.util.Scanner;

public class creditPaymentsCount {
    public static void main(String[] args) {
        final int MONTHS_PER_YEAR = 12; // 1 год содержит 12 месяцев

        double annualInterestRate, monthlyInterestRate,
                loanAmount, monthlyPayment, totalPayment;
        int numberOfYears;

        Scanner input = new Scanner(System.in);

        // Получить ежегодную ставку по кредиту в процентах
        System.out.print("Введите ежегодную ставку по кредиту в %, например, 8.25: ");
        annualInterestRate = input.nextDouble();

        // Получить срок кредита в годах
        System.out.print("Введите срок кредита в годах, например, 5: ");
        numberOfYears = input.nextInt();

        // Получить сумму кредита в рублях
        System.out.print("Введите сумму кредита в рублях, например, 120000.95: ");
        loanAmount = input.nextDouble();

        // Вычислить ежемесячную ставку по кредиту в долях единицы
        monthlyInterestRate = annualInterestRate / 12 / 100;

        // Вычислить ежемесячный платеж и стоимость кредита в рублях
        monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * MONTHS_PER_YEAR));
        totalPayment = monthlyPayment * numberOfYears * MONTHS_PER_YEAR;

        // Отобразить ежемесячный платеж и стоимость кредита в рублях,
        // округлив в пользу заемщика
        System.out.println("Ежемесячный платеж равен " +
                (int)(monthlyPayment * 100) / 100.0 + " руб.");
        System.out.println("Стоимость кредита равна " +
                (int)(totalPayment * 100) / 100.0 + " руб.");
    }
}
