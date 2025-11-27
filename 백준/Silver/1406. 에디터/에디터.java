import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String init = st.nextToken();
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        for(int i=0;i<init.length();i++){
            left.push(init.charAt(i));
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("P")){
                char c = st.nextToken().charAt(0);
                left.push(c);
            } else if(command.equals("L")){
                if(left.isEmpty())
                    continue;
                right.push(left.peek());
                left.pop();
            } else if(command.equals("D")){
                if(right.isEmpty())
                    continue;
                left.push(right.peek());
                right.pop();
            } else if(command.equals("B")){
                if(left.isEmpty())
                    continue;
                left.pop();
            }
        }
        LinkedList<Character> list = new LinkedList<>();
        while(!left.empty()){
            list.addFirst(left.pop());
        }
        while(!right.isEmpty()){
            list.addLast(right.pop());
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : list){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
