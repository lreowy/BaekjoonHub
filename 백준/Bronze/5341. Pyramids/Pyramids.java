import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int N = sc.nextInt();
            if(N == 0) break;
            int sum = 0;
            for(int i=1;i<=N;i++) {
                sum += i;
            }
            System.out.println(sum);
            
        }
        
        sc.close();

    }

}