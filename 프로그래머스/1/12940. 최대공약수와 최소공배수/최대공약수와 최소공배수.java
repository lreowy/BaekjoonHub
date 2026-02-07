class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(n > m){
            answer[0] = gcd(n,m);
            answer[1] = lcm(n,m);
        } else {
            answer[0] = gcd(m,n);
            answer[1] = lcm(m,n);
        }
        return answer;
    }
    
    private int gcd(int n, int m){
        while(m != 0){
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
    
    private int lcm(int n, int m){
        return n * m / gcd(n,m);
    }
}