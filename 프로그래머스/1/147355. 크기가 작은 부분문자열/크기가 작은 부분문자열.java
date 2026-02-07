class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long target = Long.parseLong(p);
        for(long i=0;i<t.length()-p.length()+1;i++){
            String s = "";
            for(long j=i;j<i+p.length();j++){
                s += Character.toString(t.charAt((int)j));
            }
            long num = Long.parseLong(s);
            if(target >= num)
                answer++;
        }
        return answer;
    }
}