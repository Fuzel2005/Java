import java.util.Scanner;
public class fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Fibonacci series up to " + number + ":");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
