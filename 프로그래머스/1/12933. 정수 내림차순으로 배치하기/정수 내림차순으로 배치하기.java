import java.util.*;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        String[] split = s.split("");
        Arrays.sort(split);
        List<String> list = Arrays.asList(split);
        Collections.reverse(list);
        String num = "";
        for(String ss : list){
            num += ss;
        }
        
        return Long.parseLong(num);
    }
}