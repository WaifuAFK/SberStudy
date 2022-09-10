package Project;

import java.util.Scanner;

public class Project_Dollars {
    public static void main(String[] args) {

        final double ROUBLES_PER_DOLLAR = 77.22;
        int dollars;
        double roubles;
        int digit;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму американских долларов: ");
        dollars = input.nextInt();

        System.out.print(dollars);

        if (5 <= dollars && dollars <= 20)
            System.out.print(" американских долларов равны ");
        else {
            digit = dollars % 10;

            if (digit == 1)
                System.out.print(" американский доллар равен ");
            else if (2 <= digit && digit <= 4)
                System.out.print(" американских доллара равны ");
            else
                System.out.print(" американских долларов равны ");
        }

        roubles = ROUBLES_PER_DOLLAR * dollars;

        System.out.println((int)(roubles * 100) / 100.0 + " рублей.");
    }
}
