package Homework.Number1.Part2;

import java.util.Scanner;

/*
У Марата был взломан пароль. Он решил написать программу,
которая проверяет его пароль на сложность. В интернете он узнал, что пароль
должен отвечать следующим требованиям:

● пароль должен состоять из хотя бы 8 символов;
● в пароле должны быть:
○ заглавные буквы
○ строчные символы
○ числа
○ специальные знаки(_*-)

Если пароль прошел проверку, то программа должна вывести в консоль строку пароль
надежный, иначе строку: пароль не прошел проверку

65-90  для Заглавных букв
97-122 для строчных букв

 */
public class Part2Add1 {
    public static void main(String[] args) {
        String PASSWORD;
        boolean isTallLetters = false,isSmallLetters = false, isNumbers = false, isSpecialSymbols = false;
        boolean isResult = true;

        Scanner sc = new Scanner(System.in);

        PASSWORD = sc.nextLine();

        if (PASSWORD.length() < 6)
            isResult = false;
        else {
            // проверка на заглавные буквы, строчные, цифры и спецсимволы
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
        }

        if (isNumbers && isSmallLetters && isTallLetters && isSpecialSymbols && isResult)
            System.out.println("пароль надежный");
        else System.out.println("пароль не прошел проверку");
    }
}
