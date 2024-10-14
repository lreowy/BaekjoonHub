import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x,y,z;

        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        System.out.println(x+y-z);
        
        String a = String.valueOf(x);
        String b = String.valueOf(y);
        String c = String.valueOf(z);


        System.out.println(Integer.parseInt(a.concat(b)) - Integer.parseInt(c));

    }
}
