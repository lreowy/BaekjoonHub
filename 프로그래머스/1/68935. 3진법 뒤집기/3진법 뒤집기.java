import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String n3 = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder();
        sb.append(n3);
        String reverse = sb.reverse().toString();
        answer = Integer.parseInt(reverse,3);
        return answer;
    }
}