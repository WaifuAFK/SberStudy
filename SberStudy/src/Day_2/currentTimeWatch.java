package Day_2;

/*
Напишите программу, которая отображает текущее время по Гринвичу (GMT — Greenwich Mean Time) в формате часы:минуты:секунды, например, 13:19:8 GMT.

КОНСТАНТЫ:

final int MILLISECONDS_PER_SECOND = 1000; // 1 секунда содержит 1000 миллисекунд
final int SECONDS_PER_MINUTE = 60; // 1 минута содержит 60 секунд
final int MINUTES_PER_HOUR = 60; // 1 час содержит 60 минут
final int HOURS_PER_DAY = 24; // 1 сутки содержат 24 часа

Входные данные:

long totalMilliseconds; // общее кол-во миллисекунд, прошедших с 00:00:00 GMT 01/01/1970

Выходные данные:

long currentHour; // текущее кол-во часов по Гринвичу
long currentMinute; // текущее кол-во минут
long currentSecond; // текущее кол-во секунд

Переменные программы:

long totalSeconds; // общее кол-во секунд, прошедших с 00:00:00 GMT 01/01/1970
long totalMinutes; // общее кол-во минут, прошедших с 00:00:00 GMT 01/01/1970
long totalHours; // общее кол-во часов, прошедших с 00:00:00 GMT 01/01/1970

Формулы:

totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;
currentSecond = totalSeconds % SECONDS_PER_MINUTE;
totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
currentMinute = totalMinutes % MINUTES_PER_HOUR;
totalHours = totalMinutes / MINUTES_PER_HOUR;
currentHour = totalHours % HOURS_PER_DAY;

Методика решения:

1. Получить общее кол-во миллисекунд, прошедших с 00:00:00 GMT 01/01/1970.

2. Вычислить общее кол-во секунд, прошедших с 00:00:00 GMT 01/01/1970.

   2.1. totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND.

3. Вычислить текущее кол-во секунд.

   3.1. currentSecond = totalSeconds % SECONDS_PER_MINUTE.

4. Вычислить общее кол-во минут, прошедших с 00:00:00 GMT 01/01/1970.

   4.1. totalMinutes = totalSeconds / SECONDS_PER_MINUTE.

5. Вычислить текущее кол-во минут.

   5.1. currentMinute = totalMinutes % MINUTES_PER_HOUR.

6. Вычислить общее кол-во часов, прошедших с 00:00:00 GMT 01/01/1970.

   6.1. totalHours = totalMinutes / MINUTES_PER_HOUR.

7. Вычислить текущее кол-во часов по Гринвичу.

   7.1. currentHour = totalHours % HOURS_PER_DAY.

8. Отобразить текущее время по Гринвичу.

 */

public class currentTimeWatch {
    public static void main(String[] args) {
        final int MILLISECONDS_PER_SECOND = 1000, SECONDS_PER_MINUTE = 60,
                MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24;

        long totalMilliseconds, totalSeconds, currentSecond,
                totalMinutes, currentMinute, totalHours, currentHour;

        // Получить общее кол-во миллисекунд, прошедших с 00:00:00 GMT 01/01/1970
        totalMilliseconds = System.currentTimeMillis();

        // Вычислить общее кол-во секунд, прошедших с 00:00:00 GMT 01/01/1970
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;

        // Вычислить текущее кол-во секунд
        currentSecond = totalSeconds % SECONDS_PER_MINUTE;

        // Вычислить общее кол-во минут, прошедших с 00:00:00 GMT 01/01/1970
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;

        // Вычислить текущее кол-во минут
        currentMinute = totalMinutes % MINUTES_PER_HOUR;

        // Вычислить общее кол-во часов, прошедших с 00:00:00 GMT 01/01/1970
        totalHours = totalMinutes / MINUTES_PER_HOUR;

        // Вычислить текущее кол-во часов по Гринвичу
        currentHour = totalHours % HOURS_PER_DAY;

        // Отобразить текущее время по Гринвичу
        System.out.println("Текущее время равно " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT.");
    }
}
