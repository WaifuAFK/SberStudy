package Day_4;

/*
Напишите программу, которая отображает в консоли следующие выходные данные:

0 1
1 2
2 4
3 8
4 16
5 32
6 64
 */

public class whileCycle {
    public static void main(String[] args) {
        int n = 0;
        int a = 1;

        while (n < 7) {
            System.out.println(n + " " + a);
            a *= 2;
            n++;
        }
    }
}
