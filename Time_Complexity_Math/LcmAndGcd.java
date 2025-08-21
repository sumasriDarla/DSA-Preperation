class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int A = a;
        int B = b;
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
       int gcd = a;
       int lcm = (A*B)/gcd;
       return new int[]{lcm,gcd};
    }
}
