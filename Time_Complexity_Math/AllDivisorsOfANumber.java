class Solution {
    public static void print_divisors(int n) {
        // code here
        List<Integer> small = new ArrayList<>();
        List <Integer> large = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                small.add(i);
                if(i!=(n/i)){
                    large.add(n/i);
                }
            }
        }
        Collections.reverse(large);
        small.addAll(large);
        int[] arr = new int[small.size()];
        for(int i=0;i<small.size();i++){
            arr[i] = small.get(i);
            System.out.print(arr[i]+" ");
        }  
    }
}
