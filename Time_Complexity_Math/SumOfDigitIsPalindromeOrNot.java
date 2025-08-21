// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        while(n>0){
            int lastdi = n%10;
            sum+=lastdi;
            n=n/10;
        }
        String s = Integer.toString(sum);
        String reverse =new StringBuilder(s).reverse().toString();
        if(s.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
}
