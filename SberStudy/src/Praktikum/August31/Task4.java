package Praktikum.August31;

/*
На вход подается строка, состоящая из заглавных и прописных латинских букв (вида CamelCase).
Вывести эту же строку, но состоящую только из прописных букв (вид snake_case),
а перед местом, где была заглавная буква - должен быть выведен символ нижнего подчеркивания.

Пример:
ItIsCamelCaseString -> it_is_camel_case_string
 */

import java.util.Locale;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        System.out.println(sentence.replaceAll("([a-z])([A-Z])+", "$1_$2").toLowerCase());
    }
}
