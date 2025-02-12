import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test_case = 1; test_case<=t;test_case++) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            sb.append(s);
             
            int palindrome = -1;
            if(sb.reverse().toString().equals(s))
                palindrome = 1;
            else {
                palindrome = 0;
            }
             
            System.out.println("#" + test_case + " " + palindrome);
             
        }
    }
}