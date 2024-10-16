import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] array = s.split(" ");
        int count = 0;
        for(String arr : array) {
            if (!arr.isEmpty())
                count += 1;
        }

        System.out.print(count);
    }
}