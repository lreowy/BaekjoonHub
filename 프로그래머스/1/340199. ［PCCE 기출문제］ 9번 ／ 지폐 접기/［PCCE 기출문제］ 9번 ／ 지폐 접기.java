class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int bigWallet = 0;
        int smallWallet = 0;
        int bigBill = 0;
        int smallBill = 0;
        if(wallet[0] < wallet[1]){
            bigWallet = wallet[1];
            smallWallet = wallet[0];
        } else {
            bigWallet = wallet[0];
            smallWallet = wallet[1];
        }
            
        if(bill[0] < bill[1]){
            bigBill = bill[1];
            smallBill = bill[0];
        } else {
            bigBill = bill[0];
            smallBill = bill[1];
        }
            
        while(smallBill > smallWallet || bigBill > bigWallet){
            if(bill[0] > bill[1])
                bill[0] = bill[0] / 2;
            else
                bill[1] = bill[1] / 2;
            answer++;
            if(bill[0] < bill[1]){
            bigBill = bill[1];
            smallBill = bill[0];
        } else {
            bigBill = bill[0];
            smallBill = bill[1];
        }
        }
        return answer;
    }
}