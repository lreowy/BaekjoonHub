import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-->0) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int n = scanner.nextInt();

            int floor = (n - 1) % h + 1; // 층수 계산
            int room = (n - 1) / h + 1; // 방 번호 계산

            int roomNumber = floor * 100 + room; // 방 번호 조합
            System.out.println(roomNumber);
        }
    }
}

