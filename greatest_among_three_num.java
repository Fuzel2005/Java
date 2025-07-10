import java.util.Scanner;
public class greatest_among_three_num {
    // make it user defined
    public static int greatest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a; // a is greatest
        } else if (b >= a && b >= c) {
            return b; // b is greatest
        } else {
            return c; // c is greatest
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int greatestNumber = greatest(a, b, c);
        System.out.println("The greatest number among " + a + ", " + b + ", and " + c + " is: " + greatestNumber);
    }
}
