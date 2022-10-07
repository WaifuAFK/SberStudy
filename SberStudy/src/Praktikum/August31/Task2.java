package Praktikum.August31;

/*
На вход подается две строки: первая содержит номер карты, вторая — пинкод.
Проверить, что первая состоит из 16 цифр, разделенных пробелом (вид XXXX XXXX XXXX XXXX, где X - цифра) и проверить,
что вторая состоит из 4 цифр.

Вывести true, если все ок, иначе false.

Пример:
12345678 n345 3994
12345
--> false

1234 5678 9123 2322
1234
--> true
 */


import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cardNumber = sc.nextLine();
        String pinCode = sc.nextLine();

        System.out.println(cardNumber.matches("(\\d{4} ){3}(\\d{4})") && pinCode.matches("(\\d{4})"));
    }
}
