class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6)
            return false;
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(c - 65 > 0)
                return false;
        }
        return answer;
    }
}