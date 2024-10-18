import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String sum = String.valueOf(a*b*c);
        String[] sumSplit = sum.split("");

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for(String s : sumSplit){
                if(s.equals(String.valueOf(i)))
                    count++;
            }
            System.out.println(count);
        }

    }
}