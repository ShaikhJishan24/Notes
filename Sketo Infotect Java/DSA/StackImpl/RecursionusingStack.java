public class RecursionusingStack {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base condition
        } else {
            return n * factorial(n - 1); // recursive call
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " = " + result);
    }
}
