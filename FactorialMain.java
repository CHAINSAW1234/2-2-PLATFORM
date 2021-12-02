import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner((System.in));
        int n = scanner.nextInt();
        scanner.close();
        for(int i = 1; i <= n; i++) {
            getFactorial(i);
            System.out.println("Factorial of " + i + " = " + num);
        }

    }
    static long num=1;
    private static long getFactorial(final int n) {
        return num = num*n;
    }
}