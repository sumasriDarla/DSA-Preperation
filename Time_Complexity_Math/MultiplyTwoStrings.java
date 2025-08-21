import java.math.BigInteger;
class Solution {
    public String multiplyStrings(String s1, String s2) {
        // code here
        BigInteger num1 = new BigInteger(s1.trim());
        BigInteger num2 = new BigInteger(s2.trim());
        BigInteger product = num1.multiply(num2);
        return product.toString();
    }
    int toInteger(String s){
        s=s.trim();
        int result=0;
        int sign=1;
        int i=0;
        if(s.charAt(0)=='-'){
            sign=-1;
            i=1;
        }
        for(;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
               result=result*10+(s.charAt(i)-'0'); 
            }
            
        }
        return result*sign;
        
    }
}
