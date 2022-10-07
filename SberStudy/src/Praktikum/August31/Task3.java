package Praktikum.August31;

/*
Запросить у пользователя имя, день рождения, номер телефона, email.
Каждое из полученных ответов проверить регулярным выражением по описанным ниже правилам.
Если все введено верно, вывести “Ok”.
Если хотя бы одно из полей не соответствует - вывести “Wrong Answer” и завершить работу программы.

Проверки:
Имя
    Должно содержать только буквы. Начинаться с заглавной буквы и далее только прописные. От 2 до 20 символов.
День рождения
    Должно иметь вид DD.MM.YYYY (DD, MM, YYYY - цифры, без ограничений)
Номер телефона
    Должно начинаться со знака +, далее ровно 11 цифр.
Email
    В начале идут прописные буквы или цифры или один из спец. символов _ - * .
    Далее обязательно символ @
    Далее прописные буквы или цифры
    Далее точка
    Далее “com” или “ru”

 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birth = sc.nextLine();
        String phone = sc.nextLine();
        String email = sc.nextLine();

        String nameRegex = "[А-ЯЁ][а-яё]{1,19}";
        String birthRegex = "\\d{2}\\.\\d{2}\\.\\d{4}";
        String phoneRegex = "\\+\\d{11}";
        String emailRegex = "(^[a-z0-9\\_\\-\\*\\.]+@[a-z0-9]+\\.(com|ru)$)";

        if(name.matches(nameRegex) && birth.matches(birthRegex) && phone.matches(phoneRegex) && email.matches(emailRegex)) {
            System.out.println("Ок");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
