import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> array = new Stack<>();
        Stack<Integer> result = new Stack<>();
        for(int a : arr){
            array.push(a);
        }
        
        while(!array.isEmpty()){
            if(result.isEmpty()){
                result.push(array.peek());
                array.pop();
            }
            if(result.peek() == array.peek())
                array.pop();
            else {
                result.push(array.peek());
                array.pop();
            }
        }
        int[] answer = new int[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = result.peek();
            result.pop();
        }
        
        return answer;
    }
}