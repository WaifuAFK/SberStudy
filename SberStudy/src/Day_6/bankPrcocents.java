package Day_6;

import java.time.LocalDate;
import java.util.Scanner;

public class bankPrcocents {
    static final int MONTHS_OF_YEAR = 12; // месяцев в году
    static final int DAYS_YEAR = 365; // дней в году
    public static void main(String[] args) {
        int startMonth; // номер месяца открытия вклада
        int startYear; // год открытия вклада
        int depositTerm; // срок вклада в месяцах
        double rate; // процентная ставка (% годовых)
        double depositAmount; // сумма вклада
        double accruedInterestPerMonth; // доход по вкладу в текущем месяце
        double accruedInterestTotal = 0; // суммарный доход по вкладу

        Scanner input = new Scanner(System.in);
        // Получить номер месяц открытия вклада
        System.out.print("Введите номер месяца открытия вклада: ");
        startMonth = input.nextInt();

        // Получить год открытия вклада
        System.out.print("Введите год открытия вклада: ");
        startYear = input.nextInt();

        // Получить срок вклада в месяцах
        System.out.print("Введите срок вклада в месяцах: ");
        depositTerm = input.nextInt();

        // Получить сумму вклада
        System.out.print("Введите сумму вклада: ");
        depositAmount = input.nextDouble();

        // Получить годовую процентную ставку
        System.out.print("Введите годовую процентную ставку: ");
        rate = input.nextDouble();

        int monthsCount = 0; // счетчик месяцев

        int i = startYear;
        while (monthsCount < depositTerm) { // выполняем пока счетчик месяцев меньше срока вклада
            // в цикле будем увеличивать счетчик месяцев на 1
            for (int j = 1; j <= MONTHS_OF_YEAR; j++) { // итерация по месяцам с 1 до 12
                // Если номер месяца меньше или равно номеру месяца открытия вклада
                // то переходим к следующему месяцу, он не попадает в интервал
                if (i == startYear && j <= startMonth) {
                    continue; // пропускаем текущую итерацию, переходим к следующему месяцу
                }
                // Если номер текущего месяца равен сроку вклада,
                // то расчет заканчиваем и выходим из цикла
                if (monthsCount == depositTerm) {
                    // выходим из текущего цикла for, из внешнего цикла while выходим по условию monthsCount < depositTerm
                    break;
                }
                // Получаем количество дней в текущем месяце
                int lengthOfMonth = LocalDate.of(i, j, 1).lengthOfMonth();

                // Рассчитаем доход по вкладу в текущем месяце
                accruedInterestPerMonth = depositAmount * rate / 100 / DAYS_YEAR * lengthOfMonth;
                accruedInterestPerMonth = Math.round(accruedInterestPerMonth * 100) / 100.0; // округление до копейки

                // Вывести результат начисленных процентов в месяце
                System.out.println("Начислено процентов в " + i + " году " + j + " месяца = " + accruedInterestPerMonth);

                // Добавим процент по вкладам текущего месяца к суммарной выплате
                accruedInterestTotal = accruedInterestTotal + accruedInterestPerMonth;

                monthsCount++; // увеличим счетчик месяцев на 1

            }
            i++; // увеличим год на 1
        }
        // Вывести итоговый результат начисленных процентов
        System.out.println("Всего начислено процентов = " + accruedInterestTotal);

    }
}
