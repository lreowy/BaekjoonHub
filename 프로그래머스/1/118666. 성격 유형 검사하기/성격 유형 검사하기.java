class Solution {
    public String solution(String[] survey, int[] choices) {
        int R =0, T=0;
        int C = 0, F = 0;
        int J = 0, M = 0;
        int A = 0, N = 0;
        
        for(int i=0;i<survey.length;i++){
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);
            //점수
            int score = Math.abs(4-choices[i]);
            
            //선택지가 비동의면 첫번째 글자 유형에 점수
            if(choices[i] < 4){
                if(first == 'R')
                    R += score;
                else if(first == 'T')
                    T += score;
                else if(first == 'C')
                    C += score;
                else if(first == 'F')
                    F += score;
                else if(first == 'J')
                    J += score;
                else if(first == 'M')
                    M += score;
                else if(first == 'A')
                    A += score;
                else if(first == 'N')
                    N += score;
            }
            else if(choices[i] > 4){
                if(second == 'R')
                    R += score;
                else if(second == 'T')
                    T += score;
                else if(second == 'C')
                    C += score;
                else if(second == 'F')
                    F += score;
                else if(second == 'J')
                    J += score;
                else if(second == 'M')
                    M += score;
                else if(second == 'A')
                    A += score;
                else if(second == 'N')
                    N += score;
            }
        }
        String answer = "";
        if(R >= T)
            answer += "R";
        else
            answer += "T";
        if(C >= F)
            answer += "C";
        else
            answer += "F";
        if(J>=M)
            answer += "J";
        else
            answer += "M";
        if(A>=N)
            answer += "A";
        else
            answer += "N";
        return answer;
    }
}