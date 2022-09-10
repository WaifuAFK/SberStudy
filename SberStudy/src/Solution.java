import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double r, V, doubleSplit;

        Scanner input = new Scanner(System.in);

        r = input.nextDouble();

        doubleSplit = (double) 4 / 3;

        V = doubleSplit * Math.PI * (r * r * r);

        System.out.println(V);
    }
}
