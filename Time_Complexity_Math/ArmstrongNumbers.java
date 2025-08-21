// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int number = n;
        int sum = 0;
        while(n!=0){
            int lastdigi =n%10;
            sum=sum+(lastdigi*lastdigi*lastdigi);
            n=n/10;
        }
        if(number == sum){
            return true;
        }else{
            return false;
        }
        
    }
}
