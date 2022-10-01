import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int N;
        int[] myArray;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        myArray = new int[N];

        int[] resultArray = new int[N];

        // Заполнить массив входными данными
        for (int i = 0; i <= N - 1; i++) {
            myArray[i] = sc.nextInt();
        }

        // Перенсти возвденные в квадрат значения в resultArray
        for (int i = 0; i < myArray.length; i++) {
            resultArray[i] = (int) Math.pow(myArray[i], 2 );
        }

        //Отсортировать и вывести результирующий массив
        Arrays.sort(resultArray);

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            System.out.print(" ");
        }
    }
}
