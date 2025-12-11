import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        for(char c : array){
            if(c == '('){
                stack.push('(');
            } else if(c == ')'){
                if(stack.isEmpty())
                    return false;
                else
                    stack.pop();
            }
        }
        if(stack.isEmpty())
            answer = true;
        else
            answer = false;
        return answer;
    }
}