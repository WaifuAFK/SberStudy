package Homework.Number2.Part2;

/*
Раз в год Петя проводит конкурс красоты для собак. К сожалению, система
хранения участников и оценок неудобная, а победителя определить надо. В
первой таблице в системе хранятся имена хозяев, во второй - клички животных,
в третьей — оценки трех судей за выступление каждой собаки. Таблицы
связаны между собой только по индексу. То есть хозяин i-ой собаки указан в i-ой
строке первой таблицы, а ее оценки — в i-ой строке третьей таблицы. Нужно
помочь Пете определить топ 3 победителей конкурса.

На вход подается число N — количество участников конкурса. Затем в N
строках переданы имена хозяев. После этого в N строках переданы клички
собак. Затем передается матрица с N строк, 3 вещественных числа в каждой —
оценки судей. Победителями являются три участника, набравшие
максимальное среднее арифметическое по оценкам 3 судей. Необходимо
вывести трех победителей в формате “Имя хозяина: кличка, средняя оценка”.
Гарантируется, что среднее арифметическое для всех участников будет
различным.

4
Иван
Николай
Анна
Дарья
Жучка
Кнопка
Цезарь
Добряш
7 6 7
8 8 7
4 5 6
9 9 9


 */


import java.util.Arrays;
import java.util.Scanner;

public class N2Part2Number7 {

    public static void main(String[] args) {
        int firstPlace = 0;
        int secondPlace = 0;
        int thirdPlace = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[][] matrixParticipants = new String[2][N];
        int[][] matrixScore = new int[N][3];

        //заполнить участников
        for (int i = 0; i < matrixParticipants.length; i++) {
            for (int j = 0; j < matrixParticipants[i].length; j++) {
                matrixParticipants[i][j] = sc.next();
            }
        }

        // заполнить оценки
        for (int i = 0; i < matrixScore.length; i++) {
            for (int j = 0; j < matrixScore[i].length; j++) {
                matrixScore[i][j] = sc.nextInt();
            }
        }

        // Создать массив с вычисленнным ср арифметическим.
        double[] matrixScoreCounted = new double[N];

        for (int i = 0; i < matrixScoreCounted.length; i++) {
            matrixScoreCounted[i] = averageArithmetic(matrixScore, i);
        }

        // найти индексы трех максимальных значений
        double[] matrixScoreSortedAndCounted = matrixScoreCounted.clone();
        Arrays.sort(matrixScoreSortedAndCounted);

        for (int i = 0; i < matrixScoreCounted.length; i++) {
            if (matrixScoreSortedAndCounted[matrixScoreSortedAndCounted.length - 1] == matrixScoreCounted[i]) {
                firstPlace = i;
            }
            if (matrixScoreSortedAndCounted[matrixScoreSortedAndCounted.length - 2] == matrixScoreCounted[i]) {
                secondPlace = i;
            }
            if (matrixScoreSortedAndCounted[matrixScoreSortedAndCounted.length - 3] == matrixScoreCounted[i]) {
                thirdPlace = i;
            }
        }

        String firstResult = String.valueOf(matrixScoreCounted[firstPlace]);
        String secondResult = String.valueOf(matrixScoreCounted[secondPlace]);
        String thirdResult = String.valueOf(matrixScoreCounted[thirdPlace]);

        System.out.println(matrixParticipants[0][firstPlace] + ": " + matrixParticipants[1][firstPlace] + ", " + firstResult.substring(0, 3));
        System.out.println(matrixParticipants[0][secondPlace] + ": " + matrixParticipants[1][secondPlace] + ", " + secondResult.substring(0, 3));
        System.out.println(matrixParticipants[0][thirdPlace] + ": " + matrixParticipants[1][thirdPlace] + ", " + thirdResult.substring(0, 3));

    }

    public static double averageArithmetic(int[][] array, int column) {
        double result = 0;
        result = ((array[column][0] + array[column][1] + array[column][2]) / (double) array[column].length) * 10 / 10.0;
        return result;
    }
}
