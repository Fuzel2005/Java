package patterns;

public class revrese_right_half_pyramid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
