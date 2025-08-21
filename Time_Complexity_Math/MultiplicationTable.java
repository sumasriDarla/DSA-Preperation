// User function Template for Java
class Solution {
    static ArrayList<Integer> getTable(int n) {
        // code here
        ArrayList<Integer> multiple = new ArrayList<Integer>();
        for(int i =1;i<=10;i++){
            multiple.add(i*n);
        }
        return multiple;
        
    }
}
