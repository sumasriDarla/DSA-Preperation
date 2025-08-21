// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        long maxprime = -1;
        while(n%2==0){
            maxprime=2;
            n=n/2;
        }
        for(int i = 3;i*i<= n;i+=2){
            while(n%i==0){
                maxprime = i;
                n=n/i;
            }
        }
        if(n>2){
            maxprime = n;
        }
        return (int) maxprime;
    }
}
