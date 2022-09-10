package Day_5;

/*
Напишите программу с интерактивным циклом проверки правильности ввода данных, считывающую пары целых чисел
до тех пор, пока не встретит пару, в которой одно из чисел кратно другому.
 */

import java.util.Scanner;

public class MultiplicityCheck {
    public static void main(String[] args) {
        int firstNumber, secondNumber;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите пару целых чисел через Enter: ");
            firstNumber = sc.nextInt();
            secondNumber = sc.nextInt();
        } while ( (firstNumber % secondNumber) != 0 && (secondNumber % firstNumber) != 0);

        System.out.println(firstNumber + " и "  + secondNumber + " кратны");
    }
}
