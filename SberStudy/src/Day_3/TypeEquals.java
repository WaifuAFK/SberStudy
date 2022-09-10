package Day_3;

/*
Допустимы ли следующие преобразования, включающие приведение типов? Напишите программу, чтобы проверить их.

boolean b = true;
i = (int)b;

int i = 1;
boolean b = (boolean)i;
 */

//public class TypeEquals {
//    public static void main(String[] args) {
//        boolean b = true;
//        i = (int)b;
//    }
//} спойлер: недопустимо

//public class TypeEquals {
//    public static void main(String[] args) {
//        int i = 1;
//        boolean b = (boolean)i;
//    }
 //недопустимо


/*
Напишите предложение if, которое присваивает переменной x значение 1, если y больше 0.

        if (y > 0) {
            x = 1;
        }
 */


/*
Напишите предложение if, которое увеличивает pay на 3%, если score больше 90.

 if (score > 90) {
            pay = pay + (pay / 100 * 3);
        }
 */

/*
if (x != 0) {
          product *= x;
      }
 */


/*
Напишите предложение if-else, которое увеличивает pay на 3%, если score больше 90, иначе увеличивает pay на 1%.

if (score > 90) {
            pay *= 1.03;
        } else {
            pay *= 1.01;
        }

 */

/*

if (pulse > 56) {
            System.out.println("Продолжайте тренироваться");
        } else {
            System.out.println("Ваше сердце в отличном состоянии");
        }
 */


/*


Перепишите следующее предложение, используя логическое выражение:

if (count % 10 == 0)
  newLine = true;
else
  newLine = false;

Ответ: boolean newLine = count % 10 == 0;
 */

public class TypeEquals {
    public static void main(String[] args) {
        int x = 1, y = 2;
        System.out.println(x != y);
        System.out.println(x > y && x < y);
        System.out.println(!(x == y));
        System.out.println(x > y || x < y);
        System.out.println(x >= y || x <= y);

    }
}
