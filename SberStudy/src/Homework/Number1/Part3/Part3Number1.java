package Homework.Number1.Part3;

/*
Напечатать таблицу умножения от 1 до 9. Входных данных нет. Многоточие в
примере ниже подразумевает вывод таблицы умножения и для остальных чисел
2, 3 и т. д.

Через вложенные циклы
 */

public class Part3Number1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
