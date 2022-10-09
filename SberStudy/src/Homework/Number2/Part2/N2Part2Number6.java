package Homework.Number2.Part2;

/*
Петя решил начать следить за своей фигурой. Но все существующие
приложения для подсчета калорий ему не понравились и он решил написать
свое. Петя хочет каждый день записывать сколько белков, жиров, углеводов и
калорий он съел, а в конце недели приложение должно его уведомлять,
вписался ли он в свою норму или нет.

На вход подаются числа A — недельная норма белков, B — недельная норма
жиров, C — недельная норма углеводов и K — недельная норма калорий.
Затем передаются 7 строк, в которых в том же порядке указаны сколько было
съедено Петей нутриентов в каждый день недели. Если за неделю в сумме по
каждому нутриенту не превышена недельная норма, то вывести “Отлично”,
иначе вывести “Нужно есть поменьше”.
 */

import java.util.Scanner;

public class N2Part2Number6 {

    public static void main(String[] args) {
        boolean isOk = true;
        int sumRation = 0;
        Scanner sc = new Scanner(System.in);

        int[] normalNutritionParameters = new int[4];

        for (int i = 0; i < normalNutritionParameters.length; i++) {
            normalNutritionParameters[i] = sc.nextInt();
        }

        int[][] ration = new int[7][4];

        for (int i = 0; i < ration.length; i++) {
            for (int j = 0; j < ration[i].length; j++) {
                ration[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                sumRation += ration[j][i];
            }
            if (normalNutritionParameters[i] < sumRation) {
                isOk = false;
            }
            sumRation = 0;
        }

        if (isOk) {
            System.out.println("Отлично");
        } else {
            System.out.println("Нужно есть поменьше");
        }
    }
}
