public class Test {
    public static void main(String[] args) {
        factorial(2);
    }

    public static long factorial (int n) {
        return n * factorial(n - 1);
    }
}