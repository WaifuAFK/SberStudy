package Day_5;

/*
Напишите программу, которая отображает таблицу умножения для чисел от 0 до 9.
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        int i;
        int z = 0;

        for (i = 0; i <= 10; i++) {
            System.out.print(i + "  ");
        }
        for (i = 0; i <= 10; i++) {
            for (z = 0; z < i; ++z) {
                System.out.print(i * z + "  ");
            }
            System.out.println();
        }
    }
}
