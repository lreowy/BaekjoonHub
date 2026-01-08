import java.util.*;

class Solution {
    public int[] solution(long n) {
        String[] list = String.valueOf(n).split("");
        Stack<String> stack = new Stack<>();
        for(String s : list){
            stack.push(s);
        }
        int[] answer = new int[list.length];
        for(int i=0;i<answer.length;i++){
            answer[i] = Integer.parseInt(stack.pop());
        }
        
        return answer;
    }
}