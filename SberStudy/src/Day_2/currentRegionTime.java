package Day_2;

//Напишите программу, которая отображает текущее время в регионе проживания (Москва) в формате часы:минуты:секунды, например, 13:19:8 GMT.

public class currentRegionTime {
    public static void main(String[] args) {
        final int MILLISECONDS_PER_SECOND = 1000, SECONDS_PER_MINUTE = 60,
                MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24, MOSCOW_TIME = 3;

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
        currentHour = totalHours % HOURS_PER_DAY + MOSCOW_TIME;

        // Отобразить текущее время по Гринвичу
        System.out.println("Текущее время в Москве равно " + currentHour + ":"
                + currentMinute + ":" + currentSecond);
    }
}
