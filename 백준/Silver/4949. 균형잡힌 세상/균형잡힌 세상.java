import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            stack.clear();
            String s = br.readLine();
            if(s.equals(".")){
                break;
            }
            if(check(s)) System.out.println("yes");
            else System.out.println("no");
        }
    }

    static boolean check(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                stack.push(s.charAt(i));
            else if(s.charAt(i) == '[')
                stack.push(s.charAt(i));

            if(!stack.isEmpty()){
                if(s.charAt(i) == ')'){
                    if(stack.peek() == '(')
                        stack.pop();
                    else
                        return false;
                } else if(s.charAt(i) == ']'){
                    if(stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                }
            } else {
                if(s.charAt(i) == ')'){
                    return false;
                } else if(s.charAt(i) == ']'){
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}
