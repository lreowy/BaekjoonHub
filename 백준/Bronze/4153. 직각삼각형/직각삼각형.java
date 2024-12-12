import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            } else if (a * a + b * b == c * c) {
                System.out.println("right");
            } else if (c * c + b * b == a * a) {
                System.out.println("right");
            } else if (a * a + c * c == b * b) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
        scanner.close();
    }
}
