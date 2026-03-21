class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++)
                sb.append(i);
        }
        sb.append(0);
        String front = sb.toString();
        sb.deleteCharAt(sb.length()-1);
        sb.reverse();
        return front + sb.toString();
    }
}