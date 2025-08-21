// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int number = n;
        int count = 0;
        for(int i = n;i!=0;i/=10){
            int lastdigi= i%10;
            if(lastdigi!=0 && number%lastdigi==0){
                count++;
            }
        }
        return count;
        
    }
}
