import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int N;
        String[] myArray;
        String RESULT = "";

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        myArray = new String[N];

        // Заполнить массив входными данными
        for (int i = 0; i <= myArray.length - 1; i++) {
            myArray[i] = sc.next();
        }

        // Вложенный цикл для провереки равенства элементов массива
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (myArray[i].equals(myArray[j]))
                    RESULT = myArray[i];
            }
        }

        System.out.println(RESULT);
    }
}
