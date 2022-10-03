package Homework.Number2.Part1;

/*
Создать программу генерирующую пароль.
На вход подается число N — длина желаемого пароля. Необходимо проверить,
что N >= 8, иначе вывести на экран "Пароль с N количеством символов
небезопасен" (подставить вместо N число) и предложить пользователю еще раз
ввести число N.

Если N >= 8 то сгенерировать пароль, удовлетворяющий условиям ниже и
вывести его на экран. В пароле должны быть:
● заглавные латинские символы
● строчные латинские символы
● числа
● специальные знаки(_*-)
 */

import java.util.Random;
import java.util.Scanner;

public class N2Part1Number11 {

    //Один массив со всеми возможными символами. 65 символов: 26 для алфавита(*2), 10 цифр и 3 знака
    static final char[] allSymbolsArray = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9',
            '_', '*', '-'};


    public static void main(String[] args) {
        int N = 0;
        boolean isEnough = false;

        Scanner sc = new Scanner(System.in);

        // цикл для проверки количества символов в пароле, которое вводит пользователь
        while (isEnough != true) {
            N = sc.nextInt();
            if (N < 8) {
                System.out.println("Пароль с " + N + " количеством символов небезопасен. Ввведите число ещё раз: ");
            } else
                isEnough = true;
        }

        // Вывод результата, полученного из метода generatePassword
        System.out.println(generatePassword(N));
    }

    /**
     * Метод, который генерирует пароль под условия задачи
     */
    public static String generatePassword (int passwordLength) {
        String PASSWORD = "";

        // Цикл, в котором проводится проверка корректной генерации пароля с помощью метода checkCorrectivityPassword
       while (!checkCorrectivityPassword(PASSWORD)) {
           PASSWORD = "";
           // Вложенный цикл для заполнения каждого символа пароля случайными данными из общего массива allSymbolsArray
           for (int i = 0; i < passwordLength; i++) {
               PASSWORD += allSymbolsArray[(int) (Math.random() * 64)];
           }
       }
       return PASSWORD;
    }

    /**
     * Вспомогательный метод, проверяющий наличие в сгенерированном пароле
     * всех необходимых символов
     */
    public static boolean checkCorrectivityPassword (String PASSWORD) {

        boolean isTallLetters = false, isSmallLetters = false, isNumbers = false, isSpecialSymbols = false;

        for (int i = 0; i < PASSWORD.length(); i++) {
            if (PASSWORD.charAt(i) >= 'A' && PASSWORD.charAt(i) <= 'Z')
                isTallLetters = true;

            if (PASSWORD.charAt(i) >= 'a' && PASSWORD.charAt(i) <= 'z')
                isSmallLetters = true;

            if (PASSWORD.charAt(i) == '*' || PASSWORD.charAt(i) == '_' || PASSWORD.charAt(i) == '-')
                isSpecialSymbols = true;

            if (PASSWORD.charAt(i) >= '0' && PASSWORD.charAt(i) <= '9')
                isNumbers = true;
        }
            return isNumbers && isSmallLetters && isTallLetters && isSpecialSymbols;
    }
}
