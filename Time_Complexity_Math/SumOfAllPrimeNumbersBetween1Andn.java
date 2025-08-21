class Solution {
    public int prime_Sum(int n) {
        // code here
        int sum =0;
        for(int i=2;i<=n;i++){
            boolean isprime =true;
            for(int j=2;j*j<=i;j++){
               if(i%j==0){ 
                   isprime=false;
                }
            }
            if(!isprime){
                continue; 
            }else{
                sum+=i;
            }
        }
        return sum;
    }
}
