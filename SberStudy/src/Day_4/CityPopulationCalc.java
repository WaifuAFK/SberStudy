package Day_4;

/*
В городе, чье население с каждым годом растет на 10%, живет 9 870 человек. Напишите программу, которая отображает
ежегодную численность населения и определяет, через сколько лет (count_years) она будет превышать 30 000 человек.
 */

public class CityPopulationCalc {
    public static void main(String[] args) {
        int population = 9870;
        int count_years = 0;

        while (population < 30000) {
            population += population * 0.1;
            count_years++;
        }
        System.out.println(population + " " + count_years);
    }
}
